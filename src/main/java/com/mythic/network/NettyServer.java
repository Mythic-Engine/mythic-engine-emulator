/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.aqalter.network;

import com.aqalter.api.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;


public class NettyServer extends ServerHandler {

    final private static int BUFFER_SIZE = 5120;
    final private static Logger log = LoggerFactory.getLogger(NettyServer.class);

    private final DefaultChannelGroup channels;
    private final ServerBootstrap serverBootstrap;
    //private final ServerBootstrap webSocketBootstrap;

    public NettyServer(String ip, Integer port) {
        super(ip, port);
        this.channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
        this.serverBootstrap = new ServerBootstrap();
        //this.webSocketBootstrap = new ServerBootstrap();
    }

    @Override
    public void createSocket() {
        int threads = Runtime.getRuntime().availableProcessors();

        //EventLoopGroup bossGroup = new NioEventLoopGroup(threads);
        //EventLoopGroup workerGroup = new NioEventLoopGroup();

        EventLoopGroup bossGroup = (Epoll.isAvailable() ? new EpollEventLoopGroup(threads) : new NioEventLoopGroup(threads));
        EventLoopGroup workerGroup = (Epoll.isAvailable() ? new EpollEventLoopGroup(threads) : new NioEventLoopGroup(threads));

        this.serverBootstrap.group(bossGroup, workerGroup)
            .channel(Epoll.isAvailable() ? EpollServerSocketChannel.class :  NioServerSocketChannel.class)
            .childHandler(new NettyChannelInitializer(this))
            .childOption(ChannelOption.TCP_NODELAY, true)
            .childOption(ChannelOption.SO_KEEPALIVE, true)
            .childOption(ChannelOption.SO_RCVBUF, BUFFER_SIZE)
            .childOption(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(BUFFER_SIZE))
            .childOption(ChannelOption.ALLOCATOR, new UnpooledByteBufAllocator(false))
            .childOption(ChannelOption.SO_REUSEADDR, true);

        /*this.webSocketBootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel.class)
            .handler(new LoggingHandler(LogLevel.INFO))
            .childHandler(new WebSocketServerInitializer());*/
    }

    @Override
    public boolean bind() {
        this.serverBootstrap.bind(new InetSocketAddress(this.getIp(), this.getPort())).addListener(objectFuture -> {
            if (!objectFuture.isSuccess()) {
                log.error("Failed to start server on address: {}:{}", this.getIp(), this.getPort());
            } else {
                log.debug("Ready for connections!");
            }
        });

        /*this.webSocketBootstrap.bind(new InetSocketAddress(this.getIp(), 6969)).addListener(objectFuture -> {
            if (!objectFuture.isSuccess()) {
                log.error("Failed to start web socket on address: {}:{}", this.getIp(), 6969);
            } else {
                log.debug("Ready for websocket connections!");
            }
        });*/

        return false;
    }

    /**
     * Get default channel group of channels
     * @return channels
     */
    public DefaultChannelGroup getChannels() {
        return channels;
    }
}

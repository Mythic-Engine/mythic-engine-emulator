/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public record NettyServer(String ip, int port, ServerBootstrap serverBootstrap) {

	private static final Logger log = LoggerFactory.getLogger(NettyServer.class);

	private static final int BUFFER_SIZE = 5120;
	private static final boolean IS_EPOLL_AVAILABLE = Epoll.isAvailable();
	private static final int THREADS = Runtime.getRuntime().availableProcessors();

	public void createSocket() {
		EventLoopGroup bossGroup = IS_EPOLL_AVAILABLE ? new EpollEventLoopGroup(THREADS) : new NioEventLoopGroup(THREADS);
		EventLoopGroup workerGroup = IS_EPOLL_AVAILABLE ? new EpollEventLoopGroup(THREADS) : new NioEventLoopGroup(THREADS);

		this.serverBootstrap
			.group(bossGroup, workerGroup)
			.channel(IS_EPOLL_AVAILABLE ? EpollServerSocketChannel.class : NioServerSocketChannel.class)
			.childHandler(new NettyChannelInitializer())
			.childOption(ChannelOption.TCP_NODELAY, true)
			.childOption(ChannelOption.SO_KEEPALIVE, true)
			.childOption(ChannelOption.SO_RCVBUF, BUFFER_SIZE)
			.childOption(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(BUFFER_SIZE))
			.childOption(ChannelOption.ALLOCATOR, new UnpooledByteBufAllocator(false))
			.childOption(ChannelOption.SO_REUSEADDR, true);
	}

	public void bind() {
		serverBootstrap()
			.bind(new InetSocketAddress(this.ip(), this.port()))
			.addListener(
				objectFuture -> {
					if (!objectFuture.isSuccess()) {
						log.error("Failed to start server on address: {}:{}", this.ip(), this.port());
					} else {
						log.info("Ready for connections on address: {}:{}", this.ip(), this.port());
					}
				});
	}

}

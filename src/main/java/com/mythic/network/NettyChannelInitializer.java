/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network;

import com.mythic.Main;
import com.mythic.network.codec.NetworkDecoder;
import com.mythic.network.connections.ConnectionHandler;
import com.mythic.network.filter.IPFilter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;

public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {

	private final com.aqalter.network.NettyServer nettyServer;

	public NettyChannelInitializer(com.aqalter.network.NettyServer nettyServer) {
		this.nettyServer = nettyServer;
	}

	@Override
	protected void initChannel(SocketChannel socketChannel) {
		socketChannel.pipeline()
			.addLast("ipFilter", new IPFilter())
			.addLast("traffic", Main.gtsh())
			.addLast("framer", new DelimiterBasedFrameDecoder(4096, Delimiters.nulDelimiter()))
			.addLast("gameDecoder", new NetworkDecoder())
			.addLast("handler", new ConnectionHandler(this.nettyServer));
	}

}

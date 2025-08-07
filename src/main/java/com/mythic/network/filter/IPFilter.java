/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.filter;

import com.mythic.network.game.Game;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class IPFilter extends ChannelInboundHandlerAdapter {

	@Override
	public void channelActive(final ChannelHandlerContext ctx) {
		if (!Game.isConnected(ctx.channel().remoteAddress()) && Game.isBanned(ctx.channel().remoteAddress())) {
			ctx.close();
		}
	}

}
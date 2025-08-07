/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.internal;

import com.mythic.config.ConfigData;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import net.n3.nanoxml.IXMLElement;

public class APICheck implements InternalEvent {

	@Override
	public void onEvent(IXMLElement msg, Channel channel) {
		try {
			//Fetch version
			msg = msg.getFirstChildNamed("ver");

			//Get API
			int apiVersion = Integer.parseInt(msg.getAttribute("v", ""));
			//Do something
			if (apiVersion >= 157) {
				String textToSend = "<cross-domain-policy><allow-access-from domain='*' to-ports='" + ConfigData.SERVER_PORT + "' /></cross-domain-policy>\0";
				channel.writeAndFlush(Unpooled.copiedBuffer(textToSend.getBytes()), channel.voidPromise());

				textToSend = "<msg t='sys'><body action='apiOK' r='0'></body></msg>\0";
				channel.writeAndFlush(Unpooled.copiedBuffer(textToSend.getBytes()), channel.voidPromise());
			} else {
				String textToSend = "<cross-domain-policy><allow-access-from domain='*' to-ports='" + ConfigData.SERVER_PORT + "' /></cross-domain-policy>\0";
				channel.writeAndFlush(Unpooled.copiedBuffer(textToSend.getBytes()), channel.voidPromise());

				textToSend = "<msg t='sys'><body action='apiKO' r='0'></body></msg>\0";
				channel.writeAndFlush(Unpooled.copiedBuffer(textToSend.getBytes()), channel.voidPromise());
			}
		} catch (Exception ex) {
			Game.banIP(channel.remoteAddress(), System.currentTimeMillis());
			channel.close();
			ex.printStackTrace();
		}

	}

}

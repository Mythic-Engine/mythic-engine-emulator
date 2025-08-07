/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.connections;

import com.mythic.network.NettyPlayerNetwork;
import com.mythic.network.game.Game;
import com.mythic.network.game.data.User;
import com.mythic.network.game.internal.InternalEvent;
import com.mythic.network.game.internal.InternalEventFactory;
import com.mythic.network.streams.ServerEvent;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import net.n3.nanoxml.IXMLElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionHandler extends SimpleChannelInboundHandler<ServerEvent> {

	final private static Logger log = LoggerFactory.getLogger(ConnectionHandler.class);
	private final com.aqalter.network.NettyServer server;

	public ConnectionHandler(com.aqalter.network.NettyServer server) {
		this.server = server;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext channelHandlerContext, ServerEvent serverEvent) throws Exception {
		try {
			User user = channelHandlerContext.channel().attr(User.PLAYER_KEY).get();

			if (serverEvent == null)
				return;

			if (user != null) {
				if (serverEvent.getIsXml()) {
					if ("sys".equals(serverEvent.getType())) {
						try {
							IXMLElement bodyTag;
							bodyTag = serverEvent.getXmlMsg();

							String eventName = bodyTag.getAttribute("action", "");
							InternalEvent internalEvent = InternalEventFactory.create(eventName);
							internalEvent.onEvent(bodyTag, channelHandlerContext.channel());
						} catch (Exception ex) {
							Game.banIP(channelHandlerContext.channel().remoteAddress(), System.currentTimeMillis());
							
							user.network().close();

							ex.printStackTrace();
						}
					} else {
						//log.info("Unknown packet recieved from {} thus disconnected", channelHandlerContext.channel().remoteAddress());
						user.network().close();
					}
				} else if (serverEvent.getIsStr() && serverEvent.getType().equalsIgnoreCase("xt")) {
					String[] params = splitParameters(serverEvent.getStrMsg());
					String[] xParams = new String[params.length - 3];
					String xtCmd = params[1];
					System.arraycopy(params, 3, xParams, 0, params.length - 3);

					//log.info("{}, args: {}", xtCmd, Arrays.toString(xParams));
					if (!isRequestFiltered(user, xtCmd)) {
						Request request = RequestFactory.REQUESTS.create(xtCmd);

						if (request != null) {
							alter().requestExecutor.execute(new RequestWorker(request, Player.wrap(user), RequestArgs.parse(xParams)));
						}
					}
				}
			}
		} catch (Exception ex) {
			log.error("Could not handle message: ", ex);

			Game.banIP(channelHandlerContext.channel().remoteAddress(), System.currentTimeMillis());

			if (channelHandlerContext.channel().isActive()) {
				channelHandlerContext.close();
			}
		}
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		User user = new User(new NettyPlayerNetwork(ctx.channel(), ctx.channel().hashCode()));

		ctx.channel().attr(User.PLAYER_KEY).set(user);

		if (!server.getChannels().add(ctx.channel())) {
			ctx.disconnect();
		}
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Game.removeConnected(ctx.channel().remoteAddress());

		server.getChannels().remove(ctx.channel());

		User user = ctx.channel().attr(User.PLAYER_KEY).get();

		if (user != null) {
			user.dispose();
		}
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		super.channelUnregistered(ctx);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		if (ctx.channel().isActive()) {
			ctx.channel().close();
		}
	}

	private String[] splitParameters(String str) {
		return str.split("%");
	}

	private boolean isRequestFiltered(User user, String request) {
		//TODO: REWRITE
		return true;
	}

}

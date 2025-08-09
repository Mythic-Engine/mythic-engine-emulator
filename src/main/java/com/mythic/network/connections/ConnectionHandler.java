/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.connections;

import com.mythic.database.Database;
import com.mythic.network.NettyPlayerNetwork;
import com.mythic.network.game.Game;
import com.mythic.network.game.data.User;
import com.mythic.network.streams.ServerEvent;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import net.n3.nanoxml.IXMLElement;
import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.SocketAddress;
import java.util.Date;
import java.util.Locale;

import static com.mythic.network.game.SFS.sfs;
import static com.mythic.network.game.manager.UserManager.userManager;

public class ConnectionHandler extends SimpleChannelInboundHandler<ServerEvent> {

	final private static Logger log = LoggerFactory.getLogger(ConnectionHandler.class);

	@Override
	protected void channelRead0(ChannelHandlerContext channelHandlerContext, ServerEvent serverEvent) throws Exception {
		try {
			User user = channelHandlerContext.channel().attr(User.PLAYER_KEY).get();

			if (serverEvent == null) {
				return;
			}

			if (user != null) {
				if (serverEvent.getIsXml()) {
					if ("sys".equals(serverEvent.getType())) {
						try {
							IXMLElement bodyTag;
							bodyTag = serverEvent.getXmlMsg();

							String eventName = bodyTag.getAttribute("action", "");

							switch (eventName) {
								case "verChk" -> interalVerChk(bodyTag, channelHandlerContext.channel());
								case "login" -> internalLogin(bodyTag, channelHandlerContext.channel());
							}
						} catch (Exception ex) {
							Game.banIP(channelHandlerContext.channel().remoteAddress(), System.currentTimeMillis());
							
							user.network().close();

							ex.printStackTrace();
						}
					} else {
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

	public static void interalVerChk(IXMLElement msg, Channel channel) {
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

	public static void internalLogin(IXMLElement msg, Channel channel) {
		try {
			msg = msg.getFirstChildNamed("login");
			String nick = msg.getFirstChildNamed("nick").getContent();
			String token = msg.getFirstChildNamed("pword").getContent();

			String[] obj = nick.split("~");
			String name = obj[1].toLowerCase(Locale.US);

			if (Game.isBanned(channel.remoteAddress())) {
				removeConnection(name);
				return;
			}

			if (!Game.isAllowed(name)) {
				Game.banIP(channel.remoteAddress(), System.currentTimeMillis());
				removeConnection(name);
				return;
			}

			log.info("IP: {}, Username: {}, Token: {}", channel.remoteAddress().toString().replace("/", "").split(":")[0], name, token);

			Database.open();

            /*alter().crossClient().sendToInternalServers(new JSONObject()
                .element("type", "kick")
                .element("body", new JSONObject()
                    .element("Username", name)
                )
            );*/

			User user = channel.attr(User.PLAYER_KEY).get();

			com.mythic.database.user.User userData = com.mythic.database.user.User.findFirst("Username = ? and Token = ?", name, token);

			if (userData == null || userManager().getUserByName(name) != null) {
				loginFail(name, channel, user);
			} else {
				int dbId = (int) userData.getId();

				//log.debug("data found, user id: {}", dbId);
				user.setName(name);
				userManager().addUser(user);

				//Increase count
				AlterWorld.server().increasePlayerCount();

				//Create
				Player player = Player.create(user, dbId);

				loginSuccess(user);
				player.sendLoggedInNotif();
			}

			Game.removeAllowed(name);
			Game.connect(channel.remoteAddress(), name);

			Database.close();
		} catch (Exception ex) {
			Game.banIP(channel.remoteAddress(), System.currentTimeMillis());
			channel.close();
			ex.printStackTrace();
		}

	}

	private static void loginFail(String name, Channel chan, User user) {
		//user.isBeingKicked = true;
		sfs().sendResponse(new String[]{"loginResponse", "false", "-1", name, "User Data for '" + name + "' could not be retrieved. " + "Please contact the development staff to resolve the issue."}, -1, chan);
		//user.getNetwork().getChannel().close(); Don't work

		removeConnection(name);
	}

	private static void loginSuccess(User user) {
		Player player = Player.wrap(user);

		sfs().sendResponse(new String[]{"loginResponse", "true", String.valueOf(user.userId()), user.getName(), alter().motd(player.data().language().code()), DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"), alter().settings()}, -1, user.network().getChannel());

		//Enable if necessary
		if ((int) player.data().accessLevel().getId() >= 40) {
			user.moderator(true);
		}

		//log.info("Server name is ", AlterWorld.SERVER_NAME);
		player.data().changeServer(AlterWorld.SERVER_NAME);

		//IP CHECK
		SocketAddress add = user.network().getChannel().remoteAddress();

		UserIP ipCheck = UserIP.find(player.data(), add);

		if (ipCheck == null) {
			UserIP.create(player.data(), add);
		} else {
			ipCheck.update();
		}
	}

	private static void removeConnection(String name) {
		User user = userManager().getUserByName(name);

		if (user != null) {
			user.network().close();
			//user.dispose();//TEST
			userManager().removeUser(user);
		}

		log.info("User {} {}", name, userManager().getUserByName(name) == null ? "Removed" : "Still exists");
	}

}

/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.internal;

import com.mythic.AlterWorld;
import com.mythic.config.ConfigData;
import com.mythic.data.avatar.player.Player;
import com.mythic.db.Database;
import com.mythic.db.user.UserIP;
import com.mythic.network.game.data.User;
import io.netty.channel.Channel;
import net.n3.nanoxml.IXMLElement;
import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.LoggerFactory;

import java.net.SocketAddress;
import java.util.Date;
import java.util.Locale;

import static com.mythic.AlterWorld.alter;
import static com.mythic.network.game.SFS.sfs;
import static com.mythic.network.game.manager.UserManager.userManager;

public class LoginEvent implements InternalEvent {

	final private static org.slf4j.Logger log = LoggerFactory.getLogger(LoginEvent.class);

	@Override
	public void onEvent(IXMLElement msg, Channel channel) {
		try {
			/* Fetch Elements */
			msg = msg.getFirstChildNamed("login");
			//String zone = msg.getAttribute("z", "");
			String nick = msg.getFirstChildNamed("nick").getContent();
			String token = msg.getFirstChildNamed("pword").getContent();

			/* Split needed parameters */
			String[] obj = nick.split("~");
			//String token = obj[0];
			String name = obj[1].toLowerCase(Locale.US);

			if (Game.isBanned(channel.remoteAddress())) {
				removeConnection(name);
				return;
			}

			if (!Game.isAllowed(name) && !ConfigData.STAFF_ONLY) {
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

			com.mythic.db.user.User userData = com.mythic.db.user.User.findFirst("Username = ? and Token = ?", name, token);

			if (userData == null || userManager().getUserByName(name) != null) {
				loginFail(name, channel, user);
			} else {
				int dbId = (int) userData.getId();

				//log.debug("data found, user id: {}", dbId);
				user.name(name);
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

	private void loginFail(String name, Channel chan, User user) {
		//user.isBeingKicked = true;
		sfs().sendResponse(new String[]{"loginResponse", "false", "-1", name, "User Data for '" + name + "' could not be retrieved. " + "Please contact the development staff to resolve the issue."}, -1, chan);
		//user.getNetwork().getChannel().close(); Don't work

		removeConnection(name);
	}

	private void loginSuccess(User user) {
		Player player = Player.wrap(user);

		sfs().sendResponse(new String[]{"loginResponse", "true", String.valueOf(user.userId()), user.name(), alter().motd(player.data().language().code()), DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"), alter().settings()}, -1, user.network().getChannel());

		//Enable if necessary
		if ((int) player.data().accessLevel().getId() >= 40)
			user.moderator(true);

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

	private void removeConnection(String name) {
		User user = userManager().getUserByName(name);

		if (user != null) {
			user.network().close();
			//user.dispose();//TEST
			userManager().removeUser(user);
		}

		log.info("User {} {}", name, userManager().getUserByName(name) == null ? "Removed" : "Still exists");
	}

}

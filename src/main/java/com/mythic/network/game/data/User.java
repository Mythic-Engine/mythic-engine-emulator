/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.data;

import com.mythic.AlterWorld;
import com.mythic.api.PlayerNetwork;
import com.mythic.avatars.Adventurer;
import com.mythic.database.Database;
import com.mythic.database.user.UserFriend;
import com.mythic.engine.ServerMessage;
import io.netty.util.AttributeKey;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static com.mythic.network.game.SFS.sfs;
import static com.mythic.network.game.manager.RoomManager.roomManager;
import static com.mythic.network.game.manager.UserManager.userManager;

public class User {

	public static final AttributeKey<User> PLAYER_KEY = AttributeKey.valueOf("User");
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int networkId;
	private final PlayerNetwork network;
	private final LinkedList<Room> roomsConnected = new LinkedList<>();
	public boolean isBeingKicked = false;
	public Map<String, Adventurer> properties = new HashMap<>();
	public UserRequestFilter requestFilter = new UserRequestFilter();
	private String name;
	private boolean moderator = false;

	public User(PlayerNetwork network) {
		this.networkId = count.getAndIncrement();
		this.network = network;
	}

	public Adventurer player() {
		return Adventurer.wrap(this);
	}

	public String getName() {
		return this.name.toLowerCase();
	}

	public boolean isModerator() {
		return this.moderator;
	}

	public int room() {
		int res = -1;

		try {
			res = this.roomsConnected.getFirst().getId();
		} catch (IndexOutOfBoundsException ignored) {
		}

		return res;
	}

	public int userId() {
		return this.networkId;
	}

	public PlayerNetwork network() {
		return network;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void moderator(boolean status) {
		this.moderator = status;
	}

	public void addRoom(Room r) {
		synchronized (this.roomsConnected) {
			this.roomsConnected.add(r);
		}
	}

	public void removeRoom(Room r) {
		synchronized (this.roomsConnected) {
			this.roomsConnected.remove(r);
		}
	}

	private void safeDisconnect(Adventurer player) {
		if (player.doesExist()) {
			AlterWorld.server().decreasePlayerCount();
		}

		// PARTY
		if (player.party().doesExist()) {
			player.leaveParty();
		}

		player.data().changeServer("Offline");

		//GUILD
		if ((int) player.data().guild().getId() > 0) {
			player.data().guild().update();
		}

		JSONObject updateFriend = new JSONObject()
			.element("cmd", "updateFriend")
			.element("friend", new JSONObject()
				.element("iLvl", player.data().level())
				.element("ID", player.databaseId())
				.element("sName", player.data().username())
				.element("sServer", player.data().currentServer()));

		//FRIENDS
		for (UserFriend uf : player.data().friends()) {
			com.mythic.database.user.User u = uf.friend();
			Adventurer friend = Adventurer.find(u.username());
			if (friend != null && friend.doesExist()) {
				friend.dispatch(updateFriend);
				friend.dispatch(ServerMessage.server("%s has logged out.", player.name()));
			}
		}
	}

	public void dispose() {
		Adventurer player = Adventurer.wrap(this);
		
		if (player != null) {

			Database.open();

			player.onDeath();

			if (player.gameRoom() != null) {
				player.data().lastArea(player.gameRoom().name() + "|" + player.frame() + "|" + player.pad());

				String dispatchUserGone = String.format("<msg t='sys'><body action='userGone' r='%d'><user id='%d' /></body></msg>", player.getPlace().getRoom().getId(), userId());
				sfs().sendResponseRemoveUser(dispatchUserGone, this, player.getPlace().getRoom().channelList());

				player.gameRoom().dispatchExceptOne(new String[]{"exitArea", String.valueOf(this.userId()), this.getName()}, player);

				Room room = player.gameRoom().room();

				int roomId = room.getId();
				int roomCount = room.userCount() - 1;

				room.removeUser(this);

				if (roomCount <= 0) {
					roomManager().removeRoom(roomId);
				}
			}

			safeDisconnect(player);

			player.destroy();

			this.properties.put(Adventurer.WRAPPED_PLAYER, Adventurer.NONE);

			Database.close();

			if (userManager().getUserById(this.userId()) != null) {
				userManager().removeUser(this);
			}
		}
	}

}

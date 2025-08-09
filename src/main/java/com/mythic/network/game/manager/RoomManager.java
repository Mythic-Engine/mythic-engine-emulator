/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.manager;

import com.mythic.data.avatar.player.Player;
import com.mythic.network.game.data.Room;
import com.mythic.network.game.data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.mythic.network.game.SFS.sfs;


public class RoomManager {

	private static final Logger log = LoggerFactory.getLogger(RoomManager.class);
	private static final RoomManager _instance = new RoomManager();
	private final Map<Integer, Room> roomList;

	public RoomManager() {
		this.roomList = new ConcurrentHashMap<>();
	}

	public static RoomManager roomManager() {
		return _instance;
	}

	public void addRoom(Room rm) {
		if (this.roomList.containsKey(rm.getId())) {
			return;
		}
		this.roomList.put(rm.getId(), rm);
	}

	public void removeRoom(int id) {
		//log.info("Remove room {}", id);
		this.roomList.remove(id);
	}

	public Room getRoom(int roomId) {
		return this.roomList.getOrDefault(roomId, null);
	}

	public Map<Integer, Room> getList() {
		return roomList;
	}

	public Room getRoomByName(String name) {
		return roomList.values().stream().filter(room -> room.getName().equals(name)).findFirst().orElse(null);
	}

	public void joinRoom(Player player, String name) {
		User user = player.user();

		if (user.room() != -1) {
			if (player.gameRoom().isPvP())
				player.onPvpDone();

			//Fetch current room
			Room room = getRoom(user.room());

			//Dispatch user gone
			sfs().sendResponseRemoveUser("<msg t='sys'><body action='userGone' r='" + room.getId() + "'><user id='" + user.userId() + "' /></body></msg>", user, room.channelList());

			//Send remove
			sfs().sendResponseRemoveUser(new String[]{"exitArea", String.valueOf(user.userId()), user.getName()}, room.getId(), user, room.channelList());

			//Remove to the room
			room.removeUser(user);

			if (room.userCount() <= 0)
				roomManager().removeRoom(room.getId());
		}

		Room room = getRoomByName(name);

		if (room == null) {
			log.error("room is null {}", name);
		}

		//This is outside because it should not get blocked
		room.addUser(user);

		Player wrap = Player.wrap(user);
		wrap.uotls(wrap.gameRoom());

		synchronized (room.roomSync) {
			StringBuffer response;
			response = sfs().makeHeader("sys", room.getId(), "joinOK");
			response.append("<pid id='").append(0).append("'/>");
			response.append("<vars />");
			response.append("<uLs r='").append(room.getId()).append("'>");

			int i = 1;

			for (User userRoom : room.allUsers()) {
				response.append("<u i='").append(userRoom.userId()).append("' ");
				response.append("m='").append(userRoom.isModerator() ? 1 : 0).append("' s='0' p='").append(i).append("'>");
				response.append("<n><![CDATA[").append(userRoom.getName()).append("]]></n>");
				response.append("<vars></vars></u>");
				i++;
			}

			response.append("</uLs></body></msg>");

			sfs().sendResponse(response.toString(), user.network().getChannel());

			String data = "<msg t='sys'><body action='uER' r='" + room.getId() + "'><u i ='" + user.userId() + "' m='0'><n><![CDATA[" + user.getName() + "]]></n><vars></vars></u></body></msg>";
			sfs().sendResponseRemoveUser(data, user, room.channelList());
		}
	}

	public int getRoomCount() {
		return this.roomList.size();
	}

}

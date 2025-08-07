/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.data;

import com.mythic.region.Place;
import io.netty.channel.Channel;
import net.sf.json.JSONArray;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static com.mythic.network.game.manager.UserManager.userManager;

public class Room {

	private static final AtomicInteger count = new AtomicInteger(3);
	public final Map<String, Place> properties;
	public final Object roomSync = new Object();
	private final int id;
	private final String name;
	private final int maxUsers;
	private final ConcurrentHashMap<Integer, User> roomUsers;
	public JSONArray pvpFactions;

	public Room(String name, int maxUsers) {
		this.id = count.getAndIncrement();
		this.name = name;
		this.maxUsers = maxUsers;

		this.roomUsers = new ConcurrentHashMap<>();

		this.pvpFactions = new JSONArray();

		this.properties = new LinkedHashMap<>();
	}

	public String name() {
		return this.name;
	}

	public int id() {
		return this.id;
	}

	public int userCount() {
		synchronized (this.roomSync) {
			return this.roomUsers.size();
		}
	}

	public int maxUsers() {
		return this.maxUsers;
	}

	public void addUser(User u) {
		synchronized (this.roomSync) {
			if (this.roomUsers.containsKey(u.userId())) {
				return;
			}

			u.addRoom(this);

			this.roomUsers.put(u.userId(), u);
		}
	}

	public void removeUser(User u) {
		synchronized (this.roomSync) {
			if (this.roomUsers.containsKey(u.userId())) {
				u.removeRoom(this);
				this.roomUsers.remove(u.userId());
			}
		}
	}

	public User[] allUsers() {
		ArrayList<User> tempList;
		
		synchronized (this.roomSync) {
			tempList = this.roomUsers.keySet().stream()
				.mapToInt(integer -> integer)
				.mapToObj(i -> userManager().getUserById(i))
				.filter(Objects::nonNull)
				.collect(Collectors.toCollection(ArrayList::new));
		}

		if (tempList.isEmpty()) {
			return new User[0];
		}

		Object[] tempArr = tempList.toArray();
		
		User[] allUsers = new User[tempArr.length];
		
		System.arraycopy(tempArr, 0, allUsers, 0, allUsers.length);
		
		return allUsers;
	}

	public User[] allUsersButOne(Integer excludedUserId) {
		if (excludedUserId == null) {
			return this.allUsers();
		}

		User[] allUsers;
		boolean exist;

		synchronized (this.roomSync) {
			exist = this.roomUsers.containsKey(excludedUserId);

			if (!exist) {
				return this.allUsers();
			}

			allUsers = new User[this.roomUsers.size() - 1];
			int c = 0;

			for (Integer uid : this.roomUsers.keySet()) {
				User u = userManager().getUserById(uid);

				if (uid.equals(excludedUserId)) {
					continue;
				}

				allUsers[c++] = u;
			}
		}
		
		return allUsers;
	}

	public LinkedList<Channel> channelList() {
		return Arrays.stream(this.allUsers())
			.filter(Objects::nonNull)
			.map(user -> user.network().getChannel())
			.collect(Collectors.toCollection(LinkedList::new));
	}

}

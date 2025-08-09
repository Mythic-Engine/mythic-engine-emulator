/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.manager;

import com.mythic.network.game.data.User;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserManager {

	private static final Logger log = LoggerFactory.getLogger(UserManager.class);
	private static final UserManager _instance = new UserManager();
	private final ConcurrentHashMap<Integer, User> usersConnected;
	private int highestCount = 0;

	public UserManager() {
		this.usersConnected = new ConcurrentHashMap<>();
	}

	public static UserManager userManager() {
		return _instance;
	}

	public void removeUser(User u) {
		this.usersConnected.remove(u.userId());
		//if (u != null) u = null;
	}

	public void addUser(User u) {
		this.usersConnected.put(u.userId(), u);
		if (usersConnected.size() > highestCount) highestCount = usersConnected.size();
	}

	public User getUserById(Integer i) {
		synchronized (this.usersConnected) {
			for (Map.Entry<Integer, User> map : this.usersConnected.entrySet()) {
				if (map.getValue().userId() == i)
					return map.getValue();
			}
		}
		return null;
	}

	public User getUserByName(String name) {
		User user = null;
		synchronized (this.usersConnected) {
			for (Map.Entry<Integer, User> map : this.usersConnected.entrySet()) {
				if (map.getValue().getName().equalsIgnoreCase(name))
					user = map.getValue();
			}
		}
		return user;
	}

	public LinkedList<Channel> getChannellList() {
		LinkedList<Channel> ll = new LinkedList<Channel>();
		for (User user : usersConnected.values()) {
			if (user == null) continue;
			ll.add(user.network().getChannel());
		}
		return ll;
	}

	public int getUserCount() {
		return this.usersConnected.size();
	}

	public int getUserHighestCount() {
		return this.highestCount;
	}

	public List<User> getUserList() {
		return new LinkedList<>(usersConnected.values());
	}

}

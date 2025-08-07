/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class LogType implements Serializable {

	public static final int ADMINISTRATOR_LOGIN = 1;
	public static final int MODERATOR_LOGIN = 2;
	public static final int SUSPICIOUS_ACTION = 3;
	public static final int USER_MESSAGE = 4;
	public static final int USER_WHISPER = 5;
	public static final int QUEST_ACCEPT = 6;
	public static final int QUEST_COMPLETE = 7;
	public static final int ADD_FRIEND = 8;
	public static final int DELETE_FRIEND = 9;
	public static final int KILLED_MONSTER = 10;
	private Integer id;
	private String name;
	private Set<UserLog> userLogs = new HashSet<>(0);

	public LogType() {
	}

	public LogType(String name) {
		this.name = name;
	}

	public LogType(String name, Set userLogs) {
		this.name = name;
		this.userLogs = userLogs;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserLog> getUserLogs() {
		return this.userLogs;
	}

	public void setUserLogs(Set<UserLog> userLogs) {
		this.userLogs = userLogs;
	}

}

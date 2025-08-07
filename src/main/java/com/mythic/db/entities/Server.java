/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class Server implements Serializable {

	private Integer id;
	private String name;
	private String ip;
	private boolean online;
	private boolean upgrade;
	private boolean chat;
	private int count;
	private int max;
	private String motd;

	public Server() {
	}

	public Server(String name, String ip, boolean online, boolean upgrade, boolean chat, int count, int max, String motd) {
		this.name = name;
		this.ip = ip;
		this.online = online;
		this.upgrade = upgrade;
		this.chat = chat;
		this.count = count;
		this.max = max;
		this.motd = motd;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public boolean isOnline() {
		return this.online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isUpgrade() {
		return this.upgrade;
	}

	public void setUpgrade(boolean upgrade) {
		this.upgrade = upgrade;
	}

	public boolean isChat() {
		return this.chat;
	}

	public void setChat(boolean chat) {
		this.chat = chat;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMax() {
		return this.max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public String getMotd() {
		return this.motd;
	}

	public void setMotd(String motd) {
		this.motd = motd;
	}

}

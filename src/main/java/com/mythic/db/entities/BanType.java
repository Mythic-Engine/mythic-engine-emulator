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

public class BanType implements Serializable {

	private Integer id;
	private String name;
	private Set<UserBan> userBans = new HashSet<>(0);

	public BanType() {
	}

	public BanType(String name) {
		this.name = name;
	}

	public BanType(String name, Set userBans) {
		this.name = name;
		this.userBans = userBans;
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

	public Set<UserBan> getUserBans() {
		return this.userBans;
	}

	public void setUserBans(Set<UserBan> userBans) {
		this.userBans = userBans;
	}

}

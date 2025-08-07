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

public class Faction implements Serializable {

	private Integer id;
	private String name;
	private Set<UserFaction> userFactions = new HashSet<>(0);
	private Set<Quest> quests = new HashSet<>(0);
	private Set<Item> items = new HashSet<>(0);

	public Faction() {
	}

	public Faction(String name) {
		this.name = name;
	}

	public Faction(String name, Set userFactions, Set quests, Set items) {
		this.name = name;
		this.userFactions = userFactions;
		this.quests = quests;
		this.items = items;
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

	public Set<UserFaction> getUserFactions() {
		return this.userFactions;
	}

	public void setUserFactions(Set<UserFaction> userFactions) {
		this.userFactions = userFactions;
	}

	public Set<Quest> getQuests() {
		return this.quests;
	}

	public void setQuests(Set<Quest> quests) {
		this.quests = quests;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}

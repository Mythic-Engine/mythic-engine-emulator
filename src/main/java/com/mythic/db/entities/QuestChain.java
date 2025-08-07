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

public class QuestChain implements Serializable {

	private int id;
	private String name;
	private Set<Quest> quests = new HashSet<>(0);

	public QuestChain() {
	}

	public QuestChain(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public QuestChain(int id, String name, Set quests) {
		this.id = id;
		this.name = name;
		this.quests = quests;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Quest> getQuests() {
		return this.quests;
	}

	public void setQuests(Set<Quest> quests) {
		this.quests = quests;
	}

}

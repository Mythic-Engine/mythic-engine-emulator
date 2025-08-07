/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class QuestRequirement implements Serializable {

	private QuestRequirementId id;
	private Item item;
	private Quest quest;
	private Integer quantity;

	public QuestRequirement() {
	}

	public QuestRequirement(QuestRequirementId id, Item item, Quest quest) {
		this.id = id;
		this.item = item;
		this.quest = quest;
	}

	public QuestRequirement(QuestRequirementId id, Item item, Quest quest, Integer quantity) {
		this.id = id;
		this.item = item;
		this.quest = quest;
		this.quantity = quantity;
	}

	public QuestRequirementId getId() {
		return this.id;
	}

	public void setId(QuestRequirementId id) {
		this.id = id;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Quest getQuest() {
		return this.quest;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}

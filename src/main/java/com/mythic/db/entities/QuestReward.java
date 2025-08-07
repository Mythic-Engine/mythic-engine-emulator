/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class QuestReward implements Serializable {

	private QuestRewardId id;
	private Item item;
	private Quest quest;
	private int quantity;

	public QuestReward() {
	}

	public QuestReward(QuestRewardId id, Item item, Quest quest, int quantity) {
		this.id = id;
		this.item = item;
		this.quest = quest;
		this.quantity = quantity;
	}

	public QuestRewardId getId() {
		return this.id;
	}

	public void setId(QuestRewardId id) {
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

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

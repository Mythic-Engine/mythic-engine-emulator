/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class MonsterDrop implements Serializable {

	private MonsterDropId id;
	private Item item;
	private MonsterEntity monster;
	private double chance;
	private int quantity;

	public MonsterDrop() {
	}

	public MonsterDrop(MonsterDropId id, Item item, MonsterEntity monster, double chance, int quantity) {
		this.id = id;
		this.item = item;
		this.monster = monster;
		this.chance = chance;
		this.quantity = quantity;
	}

	public MonsterDropId getId() {
		return this.id;
	}

	public void setId(MonsterDropId id) {
		this.id = id;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public MonsterEntity getMonster() {
		return this.monster;
	}

	public void setMonster(MonsterEntity monster) {
		this.monster = monster;
	}

	public double getChance() {
		return this.chance;
	}

	public void setChance(double chance) {
		this.chance = chance;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

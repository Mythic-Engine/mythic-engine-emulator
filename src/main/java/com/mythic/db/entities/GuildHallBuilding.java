/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class GuildHallBuilding implements Serializable {

	private Integer id;
	private GuildHall guildHall;
	private Item item;
	private int slot;

	public GuildHallBuilding() {
	}

	public GuildHallBuilding(GuildHall guildHall, Item item, int slot) {
		this.guildHall = guildHall;
		this.item = item;
		this.slot = slot;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GuildHall getGuildHall() {
		return this.guildHall;
	}

	public void setGuildHall(GuildHall guildHall) {
		this.guildHall = guildHall;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getSlot() {
		return this.slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

}

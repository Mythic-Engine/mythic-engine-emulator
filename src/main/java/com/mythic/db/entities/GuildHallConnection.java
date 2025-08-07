/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class GuildHallConnection implements Serializable {

	private Integer id;
	private GuildHall guildHall;
	private String pad;
	private String cell;
	private String padPosition;

	public GuildHallConnection() {
	}

	public GuildHallConnection(GuildHall guildHall, String pad, String cell, String padPosition) {
		this.guildHall = guildHall;
		this.pad = pad;
		this.cell = cell;
		this.padPosition = padPosition;
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

	public String getPad() {
		return this.pad;
	}

	public void setPad(String pad) {
		this.pad = pad;
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getPadPosition() {
		return this.padPosition;
	}

	public void setPadPosition(String padPosition) {
		this.padPosition = padPosition;
	}

}

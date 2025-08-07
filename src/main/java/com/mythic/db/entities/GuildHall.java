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

public class GuildHall implements Serializable {

	private Integer id;
	private Guild guild;
	private String linkage;
	private String cell;
	private double x;
	private double y;
	private String interior;
	private Set<GuildHallBuilding> guildHallBuildings = new HashSet<>(0);
	private Set<GuildHallConnection> guildHallConnections = new HashSet<>(0);

	public GuildHall() {
	}

	public GuildHall(Guild guild, String linkage, String cell, double x, double y, String interior) {
		this.guild = guild;
		this.linkage = linkage;
		this.cell = cell;
		this.x = x;
		this.y = y;
		this.interior = interior;
	}

	public GuildHall(Guild guild, String linkage, String cell, double x, double y, String interior, Set guildHallBuildings, Set guildHallConnections) {
		this.guild = guild;
		this.linkage = linkage;
		this.cell = cell;
		this.x = x;
		this.y = y;
		this.interior = interior;
		this.guildHallBuildings = guildHallBuildings;
		this.guildHallConnections = guildHallConnections;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Guild getGuild() {
		return this.guild;
	}

	public void setGuild(Guild guild) {
		this.guild = guild;
	}

	public String getLinkage() {
		return this.linkage;
	}

	public void setLinkage(String linkage) {
		this.linkage = linkage;
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getInterior() {
		return this.interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public Set<GuildHallBuilding> getGuildHallBuildings() {
		return this.guildHallBuildings;
	}

	public void setGuildHallBuildings(Set<GuildHallBuilding> guildHallBuildings) {
		this.guildHallBuildings = guildHallBuildings;
	}

	public Set<GuildHallConnection> getGuildHallConnections() {
		return this.guildHallConnections;
	}

	public void setGuildHallConnections(Set<GuildHallConnection> guildHallConnections) {
		this.guildHallConnections = guildHallConnections;
	}

}

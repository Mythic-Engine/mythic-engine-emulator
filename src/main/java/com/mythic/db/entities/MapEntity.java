/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MapEntity implements Serializable {

	private Integer id;
	private String name;
	private String file;
	private int maxPlayers;
	private int reqLevel;
	private boolean upgrade;
	private boolean staff;
	private boolean pvP;
	private Date lastModified;
	private Set<Item> items = new HashSet<>(0);
	private Set<MapCell> mapCells = new HashSet<>(0);
	private Set<Shop> shops = new HashSet<>(0);
	private Set<Quest> quests = new HashSet<>(0);
	private Set<MapMonster> mapMonsters = new HashSet<>(0);

	public MapEntity() {
	}

	public MapEntity(String name, String file, int maxPlayers, int reqLevel, boolean upgrade, boolean staff, boolean pvP, Date lastModified) {
		this.name = name;
		this.file = file;
		this.maxPlayers = maxPlayers;
		this.reqLevel = reqLevel;
		this.upgrade = upgrade;
		this.staff = staff;
		this.pvP = pvP;
		this.lastModified = lastModified;
	}

	public MapEntity(
		String name,
		String file,
		int maxPlayers,
		int reqLevel,
		boolean upgrade,
		boolean staff,
		boolean pvP,
		Date lastModified,
		Set mapCells,
		Set shops,
		Set mapMonsters,
		Set quests,
		Set items
	) {
		this.name = name;
		this.file = file;
		this.maxPlayers = maxPlayers;
		this.reqLevel = reqLevel;
		this.upgrade = upgrade;
		this.staff = staff;
		this.pvP = pvP;
		this.lastModified = lastModified;
		this.mapCells = mapCells;
		this.shops = shops;
		this.mapMonsters = mapMonsters;
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

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getMaxPlayers() {
		return this.maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getReqLevel() {
		return this.reqLevel;
	}

	public void setReqLevel(int reqLevel) {
		this.reqLevel = reqLevel;
	}

	public boolean isUpgrade() {
		return this.upgrade;
	}

	public void setUpgrade(boolean upgrade) {
		this.upgrade = upgrade;
	}

	public boolean isStaff() {
		return this.staff;
	}

	public void setStaff(boolean staff) {
		this.staff = staff;
	}

	public boolean isPvP() {
		return this.pvP;
	}

	public void setPvP(boolean pvP) {
		this.pvP = pvP;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<MapCell> getMapCells() {
		return this.mapCells;
	}

	public void setMapCells(Set<MapCell> mapCells) {
		this.mapCells = mapCells;
	}

	public Set<Shop> getShops() {
		return this.shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}

	public Set<Quest> getQuests() {
		return this.quests;
	}

	public void setQuests(Set<Quest> quests) {
		this.quests = quests;
	}

	public Set<MapMonster> getMapMonsters() {
		return this.mapMonsters;
	}

	public void setMapMonsters(Set<MapMonster> mapMonsters) {
		this.mapMonsters = mapMonsters;
	}

}

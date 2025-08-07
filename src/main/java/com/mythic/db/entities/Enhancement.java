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

public class Enhancement implements Serializable {

	private Integer id;
	private EnhancementPattern enhancementPattern;
	private String name;
	private int rarity;
	private int dps;
	private int level;
	private Date lastModified;
	private Set<Item> items = new HashSet<>(0);
	private Set<UserItem> userItems = new HashSet<>(0);

	public Enhancement() {
	}

	public Enhancement(EnhancementPattern enhancementPattern, String name, int rarity, int dps, int level, Date lastModified) {
		this.enhancementPattern = enhancementPattern;
		this.name = name;
		this.rarity = rarity;
		this.dps = dps;
		this.level = level;
		this.lastModified = lastModified;
	}

	public Enhancement(EnhancementPattern enhancementPattern, String name, int rarity, int dps, int level, Date lastModified, Set userItems, Set items) {
		this.enhancementPattern = enhancementPattern;
		this.name = name;
		this.rarity = rarity;
		this.dps = dps;
		this.level = level;
		this.lastModified = lastModified;
		this.userItems = userItems;
		this.items = items;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EnhancementPattern getEnhancementPattern() {
		return this.enhancementPattern;
	}

	public void setEnhancementPattern(EnhancementPattern enhancementPattern) {
		this.enhancementPattern = enhancementPattern;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRarity() {
		return this.rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getDps() {
		return this.dps;
	}

	public void setDps(int dps) {
		this.dps = dps;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public Set<UserItem> getUserItems() {
		return this.userItems;
	}

	public void setUserItems(Set<UserItem> userItems) {
		this.userItems = userItems;
	}

}

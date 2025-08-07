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

public class GameClass implements Serializable {

	private Integer id;
	private String category;
	private String description;
	private String manaRegenerationMethods;
	private String statsDescription;
	private Set<Item> items = new HashSet<>(0);
	private Set<Skill> skills = new HashSet<>(0);

	public GameClass() {
	}

	public GameClass(String category, String description, String manaRegenerationMethods, String statsDescription) {
		this.category = category;
		this.description = description;
		this.manaRegenerationMethods = manaRegenerationMethods;
		this.statsDescription = statsDescription;
	}

	public GameClass(String category, String description, String manaRegenerationMethods, String statsDescription, Set items, Set skills) {
		this.category = category;
		this.description = description;
		this.manaRegenerationMethods = manaRegenerationMethods;
		this.statsDescription = statsDescription;
		this.items = items;
		this.skills = skills;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManaRegenerationMethods() {
		return this.manaRegenerationMethods;
	}

	public void setManaRegenerationMethods(String manaRegenerationMethods) {
		this.manaRegenerationMethods = manaRegenerationMethods;
	}

	public String getStatsDescription() {
		return this.statsDescription;
	}

	public void setStatsDescription(String statsDescription) {
		this.statsDescription = statsDescription;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

}

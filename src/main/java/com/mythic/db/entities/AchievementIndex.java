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

public class AchievementIndex implements Serializable {

	private int achievementTypeId;
	private AchievementType achievementType;
	private int index;
	private String description;
	private Set<Shop> shops = new HashSet<>(0);
	private Set<Quest> quests = new HashSet<>(0);

	public AchievementIndex() {
	}

	public AchievementIndex(AchievementType achievementType, int index, String description) {
		this.achievementType = achievementType;
		this.index = index;
		this.description = description;
	}

	public AchievementIndex(AchievementType achievementType, int index, String description, Set shops, Set quests) {
		this.achievementType = achievementType;
		this.index = index;
		this.description = description;
		this.shops = shops;
		this.quests = quests;
	}

	public int getAchievementTypeId() {
		return this.achievementTypeId;
	}

	public void setAchievementTypeId(int achievementTypeId) {
		this.achievementTypeId = achievementTypeId;
	}

	public AchievementType getAchievementType() {
		return this.achievementType;
	}

	public void setAchievementType(AchievementType achievementType) {
		this.achievementType = achievementType;
	}

	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}

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

public class AchievementType implements Serializable {

	private Integer id;
	private String name;
	private String fullName;
	private Set userAchievements = new HashSet(0);
	private AchievementIndex achievementIndex;

	public AchievementType() {
	}

	public AchievementType(String name, String fullName) {
		this.name = name;
		this.fullName = fullName;
	}

	public AchievementType(String name, String fullName, Set userAchievements, AchievementIndex achievementIndex) {
		this.name = name;
		this.fullName = fullName;
		this.userAchievements = userAchievements;
		this.achievementIndex = achievementIndex;
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

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Set getUserAchievements() {
		return this.userAchievements;
	}

	public void setUserAchievements(Set userAchievements) {
		this.userAchievements = userAchievements;
	}

	public AchievementIndex getAchievementIndex() {
		return this.achievementIndex;
	}

	public void setAchievementIndex(AchievementIndex achievementIndex) {
		this.achievementIndex = achievementIndex;
	}

}

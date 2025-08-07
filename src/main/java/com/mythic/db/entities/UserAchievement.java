/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class UserAchievement implements Serializable {

	private UserAchievementId id;
	private AchievementType achievementType;
	private UserEntity userEntity;
	private int value;

	public UserAchievement() {
	}

	public UserAchievement(UserAchievementId id, AchievementType achievementType, UserEntity userEntity, int value) {
		this.id = id;
		this.achievementType = achievementType;
		this.userEntity = userEntity;
		this.value = value;
	}

	public UserAchievementId getId() {
		return this.id;
	}

	public void setId(UserAchievementId id) {
		this.id = id;
	}

	public AchievementType getAchievementType() {
		return this.achievementType;
	}

	public void setAchievementType(AchievementType achievementType) {
		this.achievementType = achievementType;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

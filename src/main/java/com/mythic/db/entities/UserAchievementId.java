/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class UserAchievementId implements Serializable {

	private int userId;
	private int achievementId;

	public UserAchievementId() {
	}

	public UserAchievementId(int userId, int achievementId) {
		this.userId = userId;
		this.achievementId = achievementId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAchievementId() {
		return this.achievementId;
	}

	public void setAchievementId(int achievementId) {
		this.achievementId = achievementId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else if (!(other instanceof UserAchievementId castOther)) {
			return false;
		} else {
			return this.getUserId() == castOther.getUserId() && this.getAchievementId() == castOther.getAchievementId();
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getUserId();
		return 37 * result + this.getAchievementId();
	}

}

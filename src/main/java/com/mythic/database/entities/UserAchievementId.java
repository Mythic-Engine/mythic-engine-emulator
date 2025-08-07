package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserAchievementId implements Serializable {

	private static final long serialVersionUID = -2189562586473992500L;
	@Column(name = "AchievementID", nullable = false)
	private Integer achievementID;

	@Column(name = "UserID", nullable = false)
	private Integer userID;

	public Integer getAchievementID() {
		return achievementID;
	}

	public void setAchievementID(Integer achievementID) {
		this.achievementID = achievementID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UserAchievementId entity = (UserAchievementId) o;
		return Objects.equals(this.achievementID, entity.achievementID) &&
			Objects.equals(this.userID, entity.userID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(achievementID, userID);
	}

}
package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users_achievements")
public class UserAchievement {

	@EmbeddedId
	private UserAchievementId id;

	@MapsId("achievementID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AchievementID", nullable = false)
	private TypeAchievement achievementID;

	@MapsId("userID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@Column(name = "Value", nullable = false)
	private Integer value;

	public UserAchievementId getId() {
		return id;
	}

	public void setId(UserAchievementId id) {
		this.id = id;
	}

	public TypeAchievement getAchievementID() {
		return achievementID;
	}

	public void setAchievementID(TypeAchievement achievementID) {
		this.achievementID = achievementID;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users_achievements")
public class UsersAchievement {

	@EmbeddedId
	private UsersAchievementId id;

	@MapsId("achievementID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AchievementID", nullable = false)
	private TypesAchievement achievementID;

	@MapsId("userID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@Column(name = "Value", nullable = false)
	private Integer value;

	public UsersAchievementId getId() {
		return id;
	}

	public void setId(UsersAchievementId id) {
		this.id = id;
	}

	public TypesAchievement getAchievementID() {
		return achievementID;
	}

	public void setAchievementID(TypesAchievement achievementID) {
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
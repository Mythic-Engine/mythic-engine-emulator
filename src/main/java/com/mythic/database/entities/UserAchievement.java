package com.mythic.database.entities;

import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_achievements")
public class UserAchievement extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AchievementID", nullable = false)
	private TypeAchievement achievement;

	@Column(name = "Value", nullable = false)
	private Integer value;

	public TypeAchievement getAchievement() {
		return achievement;
	}

	public UserAchievement setAchievement(TypeAchievement achievement) {
		this.achievement = achievement;
		return this;
	}

	public Integer getValue() {
		return value;
	}

	public UserAchievement setValue(Integer value) {
		this.value = value;
		return this;
	}

}
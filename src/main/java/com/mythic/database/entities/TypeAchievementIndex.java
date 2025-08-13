package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "types_achievements_index")
public class TypeAchievementIndex extends EntityBase {

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AchievementTypeID", nullable = false)
	private TypeAchievement achievementType;

	@Column(name = "`Index`", nullable = false)
	private Integer index;

	@Column(name = "Description", nullable = false, length = 128)
	private String description;

	public TypeAchievement getAchievementType() {
		return achievementType;
	}

	public TypeAchievementIndex setAchievementType(TypeAchievement achievementType) {
		this.achievementType = achievementType;
		return this;
	}

	public Integer getIndex() {
		return index;
	}

	public TypeAchievementIndex setIndex(Integer index) {
		this.index = index;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public TypeAchievementIndex setDescription(String description) {
		this.description = description;
		return this;
	}

}
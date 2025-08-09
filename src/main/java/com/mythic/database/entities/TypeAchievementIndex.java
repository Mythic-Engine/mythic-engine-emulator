package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "types_achievements_index")
public class TypeAchievementIndex extends EntityBase {

	@Id
	@Column(name = "AchievementTypeID", nullable = false)
	private Integer id;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "AchievementTypeID", nullable = false)
	private TypeAchievement typesAchievements;

	@Column(name = "`Index`", nullable = false)
	private Integer index;

	@Column(name = "Description", nullable = false, length = 128)
	private String description;

	public Integer getId() {
		return id;
	}

	@Override
	public TypeAchievementIndex setId(Integer id) {
		this.id = id;
		return this;
	}

	public TypeAchievement getTypesAchievements() {
		return typesAchievements;
	}

	public TypeAchievementIndex setTypesAchievements(TypeAchievement typesAchievements) {
		this.typesAchievements = typesAchievements;
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
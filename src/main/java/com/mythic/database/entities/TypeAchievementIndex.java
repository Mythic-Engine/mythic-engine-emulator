package com.mythic.database.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "types_achievements_index")
public class TypeAchievementIndex {

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

	public void setId(Integer id) {
		this.id = id;
	}

	public TypeAchievement getTypesAchievements() {
		return typesAchievements;
	}

	public void setTypesAchievements(TypeAchievement typesAchievements) {
		this.typesAchievements = typesAchievements;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
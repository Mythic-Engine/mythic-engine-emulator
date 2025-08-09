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

}
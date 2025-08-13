package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import com.mythic.helper.CombatCategory;
import jakarta.persistence.*;

@Entity
@Table(name = "enhancements_patterns")
public class EnhancementPattern extends EntityBase {

	@Column(name = "Name", length = 32, nullable = false)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "Category", length = 2, nullable = false)
	private CombatCategory category;

	@Column(name = "Wisdom", nullable = false)
	private int wisdom;

	@Column(name = "Strength", nullable = false)
	private int strength;

	@Column(name = "Luck", nullable = false)
	private int luck;

	@Column(name = "Dexterity", nullable = false)
	private int dexterity;

	@Column(name = "Endurance", nullable = false)
	private int endurance;

	@Column(name = "Intelligence", nullable = false)
	private int intelligence;

}

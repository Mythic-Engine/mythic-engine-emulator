package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills_auras")
public class SkillAura extends EntityBase {

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "Duration", nullable = false)
	private Integer duration;

	@Column(name = "Category", nullable = false, length = 8)
	private String category;

	@Column(name = "DamageIncrease", nullable = false)
	private Float damageIncrease;

	@Column(name = "DamageTakenDecrease", nullable = false)
	private Float damageTakenDecrease;

}
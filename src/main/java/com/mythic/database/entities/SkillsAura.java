package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "skills_auras")
public class SkillsAura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getDamageIncrease() {
		return damageIncrease;
	}

	public void setDamageIncrease(Float damageIncrease) {
		this.damageIncrease = damageIncrease;
	}

	public Float getDamageTakenDecrease() {
		return damageTakenDecrease;
	}

	public void setDamageTakenDecrease(Float damageTakenDecrease) {
		this.damageTakenDecrease = damageTakenDecrease;
	}

}
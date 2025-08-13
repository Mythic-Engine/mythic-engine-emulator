package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Collections;
import java.util.Set;

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

	@OneToMany(mappedBy = "auraID")
	private Set<SkillAuraEffect> skillAuraEffects = Collections.emptySet();

	public String getName() {
		return name;
	}

	public SkillAura setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getDuration() {
		return duration;
	}

	public SkillAura setDuration(Integer duration) {
		this.duration = duration;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public SkillAura setCategory(String category) {
		this.category = category;
		return this;
	}

	public Float getDamageIncrease() {
		return damageIncrease;
	}

	public SkillAura setDamageIncrease(Float damageIncrease) {
		this.damageIncrease = damageIncrease;
		return this;
	}

	public Float getDamageTakenDecrease() {
		return damageTakenDecrease;
	}

	public SkillAura setDamageTakenDecrease(Float damageTakenDecrease) {
		this.damageTakenDecrease = damageTakenDecrease;
		return this;
	}

	public Set<SkillAuraEffect> getSkillAuraEffects() {
		return skillAuraEffects;
	}

	public SkillAura setSkillAuraEffects(Set<SkillAuraEffect> skillAuraEffects) {
		this.skillAuraEffects = skillAuraEffects;
		return this;
	}
}

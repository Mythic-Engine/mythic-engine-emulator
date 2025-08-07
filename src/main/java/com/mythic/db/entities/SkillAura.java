/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SkillAura implements Serializable {

	private Integer id;
	private String name;
	private int duration;
	private String category;
	private double damageIncrease;
	private double damageTakenDecrease;
	private Set<SkillAuraEffect> skillAuraEffects = new HashSet<>(0);
	private Set<Skill> skills = new HashSet<>(0);

	public SkillAura() {
	}

	public SkillAura(String name, int duration, String category, double damageIncrease, double damageTakenDecrease) {
		this.name = name;
		this.duration = duration;
		this.category = category;
		this.damageIncrease = damageIncrease;
		this.damageTakenDecrease = damageTakenDecrease;
	}

	public SkillAura(String name, int duration, String category, double damageIncrease, double damageTakenDecrease, Set skills, Set skillAuraEffects) {
		this.name = name;
		this.duration = duration;
		this.category = category;
		this.damageIncrease = damageIncrease;
		this.damageTakenDecrease = damageTakenDecrease;
		this.skills = skills;
		this.skillAuraEffects = skillAuraEffects;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getDamageIncrease() {
		return this.damageIncrease;
	}

	public void setDamageIncrease(double damageIncrease) {
		this.damageIncrease = damageIncrease;
	}

	public double getDamageTakenDecrease() {
		return this.damageTakenDecrease;
	}

	public void setDamageTakenDecrease(double damageTakenDecrease) {
		this.damageTakenDecrease = damageTakenDecrease;
	}

	public Set<SkillAuraEffect> getSkillAuraEffects() {
		return this.skillAuraEffects;
	}

	public void setSkillAuraEffects(Set<SkillAuraEffect> skillAuraEffects) {
		this.skillAuraEffects = skillAuraEffects;
	}

	public Set<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

}

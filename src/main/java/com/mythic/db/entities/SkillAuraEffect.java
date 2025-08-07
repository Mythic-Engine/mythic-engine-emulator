/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class SkillAuraEffect implements Serializable {

	private Integer id;
	private SkillAura skillAura;
	private String stat;
	private double value;
	private String type;

	public SkillAuraEffect() {
	}

	public SkillAuraEffect(SkillAura skillAura, String stat, double value, String type) {
		this.skillAura = skillAura;
		this.stat = stat;
		this.value = value;
		this.type = type;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SkillAura getSkillAura() {
		return this.skillAura;
	}

	public void setSkillAura(SkillAura skillAura) {
		this.skillAura = skillAura;
	}

	public String getStat() {
		return this.stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

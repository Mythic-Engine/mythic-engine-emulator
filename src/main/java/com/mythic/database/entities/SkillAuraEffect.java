package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "skills_auras_effects")
public class SkillAuraEffect extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AuraID", nullable = false)
	private SkillAura auraID;

	@Column(name = "Stat", nullable = false, length = 3)
	private String stat;

	@Column(name = "Value", nullable = false)
	private Float value;

	@Column(name = "Type", nullable = false, length = 1)
	private String type;

	public SkillAura getAuraID() {
		return auraID;
	}

	public SkillAuraEffect setAuraID(SkillAura auraID) {
		this.auraID = auraID;
		return this;
	}

	public String getStat() {
		return stat;
	}

	public SkillAuraEffect setStat(String stat) {
		this.stat = stat;
		return this;
	}

	public Float getValue() {
		return value;
	}

	public SkillAuraEffect setValue(Float value) {
		this.value = value;
		return this;
	}

	public String getType() {
		return type;
	}

	public SkillAuraEffect setType(String type) {
		this.type = type;
		return this;
	}

}
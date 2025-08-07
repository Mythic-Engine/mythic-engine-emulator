package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "skills_auras_effects")
public class SkillsAurasEffect {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AuraID", nullable = false)
	private SkillsAura auraID;

	@Column(name = "Stat", nullable = false, length = 3)
	private String stat;

	@Column(name = "Value", nullable = false)
	private Float value;

	@Column(name = "Type", nullable = false, length = 1)
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SkillsAura getAuraID() {
		return auraID;
	}

	public void setAuraID(SkillsAura auraID) {
		this.auraID = auraID;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
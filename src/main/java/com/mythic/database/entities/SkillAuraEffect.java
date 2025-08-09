package com.mythic.database.entities;

import com.mythic.database.EntityBase;
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

}
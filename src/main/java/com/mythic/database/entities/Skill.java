package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "skills")
public class Skill extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AuraID", nullable = false)
	private SkillAura auraID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ClassID", nullable = false)
	private GameClass classID;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "Animation", nullable = false, length = 64)
	private String animation;

	@Lob
	@Column(name = "Description", nullable = false)
	private String description;

	@Column(name = "Damage", nullable = false)
	private Double damage;

	@Column(name = "Mana", nullable = false)
	private Integer mana;

	@Column(name = "Icon", nullable = false, length = 32)
	private String icon;

	@Column(name = "`Range`", nullable = false)
	private Integer range;

	@Column(name = "Dsrc", nullable = false, length = 16)
	private String dsrc;

	@Column(name = "Reference", nullable = false, length = 2)
	private String reference;

	@Column(name = "Target", nullable = false, length = 1)
	private String target;

	@Column(name = "Effects", nullable = false, length = 1)
	private String effects;

	@Column(name = "Type", nullable = false, length = 7)
	private String type;

	@Column(name = "Strl", nullable = false, length = 32)
	private String strl;

	@Column(name = "Cooldown", nullable = false)
	private Integer cooldown;

	@Column(name = "HitTargets", nullable = false)
	private Integer hitTargets;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

}
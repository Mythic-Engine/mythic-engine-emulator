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

	public SkillAura getAuraID() {
		return auraID;
	}

	public Skill setAuraID(SkillAura auraID) {
		this.auraID = auraID;
		return this;
	}

	public GameClass getClassID() {
		return classID;
	}

	public Skill setClassID(GameClass classID) {
		this.classID = classID;
		return this;
	}

	public String getName() {
		return name;
	}

	public Skill setName(String name) {
		this.name = name;
		return this;
	}

	public String getAnimation() {
		return animation;
	}

	public Skill setAnimation(String animation) {
		this.animation = animation;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Skill setDescription(String description) {
		this.description = description;
		return this;
	}

	public Double getDamage() {
		return damage;
	}

	public Skill setDamage(Double damage) {
		this.damage = damage;
		return this;
	}

	public Integer getMana() {
		return mana;
	}

	public Skill setMana(Integer mana) {
		this.mana = mana;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public Skill setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public Integer getRange() {
		return range;
	}

	public Skill setRange(Integer range) {
		this.range = range;
		return this;
	}

	public String getDsrc() {
		return dsrc;
	}

	public Skill setDsrc(String dsrc) {
		this.dsrc = dsrc;
		return this;
	}

	public String getReference() {
		return reference;
	}

	public Skill setReference(String reference) {
		this.reference = reference;
		return this;
	}

	public String getTarget() {
		return target;
	}

	public Skill setTarget(String target) {
		this.target = target;
		return this;
	}

	public String getEffects() {
		return effects;
	}

	public Skill setEffects(String effects) {
		this.effects = effects;
		return this;
	}

	public String getType() {
		return type;
	}

	public Skill setType(String type) {
		this.type = type;
		return this;
	}

	public String getStrl() {
		return strl;
	}

	public Skill setStrl(String strl) {
		this.strl = strl;
		return this;
	}

	public Integer getCooldown() {
		return cooldown;
	}

	public Skill setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
		return this;
	}

	public Integer getHitTargets() {
		return hitTargets;
	}

	public Skill setHitTargets(Integer hitTargets) {
		this.hitTargets = hitTargets;
		return this;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public Skill setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
		return this;
	}

}
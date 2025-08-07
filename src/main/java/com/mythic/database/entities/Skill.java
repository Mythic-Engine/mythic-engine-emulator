package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SkillAura getAuraID() {
		return auraID;
	}

	public void setAuraID(SkillAura auraID) {
		this.auraID = auraID;
	}

	public GameClass getClassID() {
		return classID;
	}

	public void setClassID(GameClass classID) {
		this.classID = classID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimation() {
		return animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDamage() {
		return damage;
	}

	public void setDamage(Double damage) {
		this.damage = damage;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public String getDsrc() {
		return dsrc;
	}

	public void setDsrc(String dsrc) {
		this.dsrc = dsrc;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getEffects() {
		return effects;
	}

	public void setEffects(String effects) {
		this.effects = effects;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrl() {
		return strl;
	}

	public void setStrl(String strl) {
		this.strl = strl;
	}

	public Integer getCooldown() {
		return cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}

	public Integer getHitTargets() {
		return hitTargets;
	}

	public void setHitTargets(Integer hitTargets) {
		this.hitTargets = hitTargets;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}
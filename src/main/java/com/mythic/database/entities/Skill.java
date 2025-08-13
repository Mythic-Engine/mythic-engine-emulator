package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.time.Instant;

@Entity
@Table(name = "skills")
public class Skill extends EntityBase {

	public static final JSONObject POTION_JSON = new JSONObject()
		.element("anim", "Cheer")
		.element("cd", "60000")
		.element("desc", "Equip a potion or scroll from your inventory to use it here.")
		.element("fx", "")
		.element("icon", "icu1")
		.element("isOK", true)
		.element("mp", "0")
		.element("nam", "Potions")
		.element("range", 808)
		.element("ref", "i1")
		.element("str1", "")
		.element("tgt", "f")
		.element("typ", "i");

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "AuraID", nullable = false)
	private SkillAura skillAura;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ClassID", nullable = false)
	private GameClass gameClass;

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

	public SkillAura getSkillAura() {
		return skillAura;
	}

	public Skill setSkillAura(SkillAura auraID) {
		this.skillAura = auraID;
		return this;
	}

	public GameClass getGameClass() {
		return gameClass;
	}

	public Skill setGameClass(GameClass classID) {
		this.gameClass = classID;
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
	
	//region JSON
	public JSONObject getActiveJSON(int rank) {
		JSONObject actObj = new JSONObject()
			.element("anim", this.getAnimation())
			.element("cd", String.valueOf(this.getCooldown()))
			.element("damage", this.getDamage())
			.element("desc", this.getDescription())
			.element("fx", this.getEffects())
			.element("icon", this.getIcon())
			.element("id", this.getId())
			.element("isOK", true)
			.element("mp", String.valueOf(this.getMana()))
			.element("nam", this.getName())
			.element("range", String.valueOf(this.getRange()))
			.element("ref", this.getReference())
			.element("tgt", this.getTarget())
			.element("typ", this.getType());
		
		if (rank < 2 && this.getReference().equals("a2")) {
			actObj.element("isOK", false);
		}

		if (rank < 3 && this.getReference().equals("a3")) {
			actObj.element("isOK", false);
		}

		if (rank < 5 && this.getReference().equals("a4")) {
			actObj.element("isOK", false);
		}

		if (!this.getStrl().isEmpty()) {
			actObj.element("strl", this.getStrl());
		}

		if (!this.getDsrc().isEmpty()) {
			actObj.element("dsrc", this.getDsrc());
		}

		if (this.getHitTargets() > 0) {
			actObj
				.element("tgtMax", String.valueOf(this.getHitTargets()))
				.element("tgtMin", "1");
		}

		return actObj;
	}

	public JSONObject getPassiveJSON(int rank) {
		return new JSONObject()
			.element("desc", this.getDescription())
			.element("fx", this.getEffects())
			.element("icon", this.getIcon())
			.element("id", this.getId())
			.element("nam", this.getName())
			.element("range", this.getRange())
			.element("ref", this.getReference())
			.element("tgt", this.getTarget())
			.element("typ", this.getType())
			.element("auras", new JSONArray().element(new JSONObject()))
			.element("isOK", rank >= 4);
	}
	//endregion

}
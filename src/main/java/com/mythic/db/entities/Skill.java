/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class Skill implements Serializable {

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
	private Integer id;
	private SkillAura skillAura;
	private GameClass gameClass;
	private String name;
	private String animation;
	private String description;
	private double damage;
	private int mana;
	private String icon;
	private int range;
	private String dsrc;
	private String reference;
	private String target;
	private String effects;
	private String type;
	private String strl;
	private int cooldown;
	private int hitTargets;
	private Date lastModified;

	public Skill() {
	}

	public Skill(
		SkillAura skillAura,
		GameClass gameClass,
		String name,
		String animation,
		String description,
		double damage,
		int mana,
		String icon,
		int range,
		String dsrc,
		String reference,
		String target,
		String effects,
		String type,
		String strl,
		int cooldown,
		int hitTargets,
		Date lastModified
	) {
		this.skillAura = skillAura;
		this.gameClass = gameClass;
		this.name = name;
		this.animation = animation;
		this.description = description;
		this.damage = damage;
		this.mana = mana;
		this.icon = icon;
		this.range = range;
		this.dsrc = dsrc;
		this.reference = reference;
		this.target = target;
		this.effects = effects;
		this.type = type;
		this.strl = strl;
		this.cooldown = cooldown;
		this.hitTargets = hitTargets;
		this.lastModified = lastModified;
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

	public GameClass getGameClass() {
		return this.gameClass;
	}

	public void setGameClass(GameClass gameClass) {
		this.gameClass = gameClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimation() {
		return this.animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDamage() {
		return this.damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public int getMana() {
		return this.mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getRange() {
		return this.range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getDsrc() {
		return this.dsrc;
	}

	public void setDsrc(String dsrc) {
		this.dsrc = dsrc;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getEffects() {
		return this.effects;
	}

	public void setEffects(String effects) {
		this.effects = effects;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrl() {
		return this.strl;
	}

	public void setStrl(String strl) {
		this.strl = strl;
	}

	public int getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public int getHitTargets() {
		return this.hitTargets;
	}

	public void setHitTargets(int hitTargets) {
		this.hitTargets = hitTargets;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

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
			actObj.element("tgtMax", String.valueOf(this.getHitTargets()));
			actObj.element("tgtMin", "1");
		}

		return actObj;
	}

	public JSONObject getPassiveJSON(int rank) {
		JSONObject passObj = new JSONObject()
			.element("desc", this.getDescription())
			.element("fx", this.getEffects())
			.element("icon", this.getIcon())
			.element("id", this.getId())
			.element("nam", this.getName())
			.element("range", this.getRange())
			.element("ref", this.getReference())
			.element("tgt", this.getTarget())
			.element("typ", this.getType())
			.element("auras", new JSONArray().element(new JSONObject()));
		passObj.element("isOK", rank >= 4);

		return passObj;
	}

}

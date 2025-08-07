/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.*;

public class EnhancementPattern implements Serializable {

	private final Map<String, Double> patterns = new HashMap<>(6);
	private Integer id;
	private String name;
	private String desc;
	private int wisdom;
	private int strength;
	private int luck;
	private int dexterity;
	private int endurance;
	private int intelligence;
	private Date lastModified;
	private Set<Enhancement> enhancements = new HashSet<>(0);

	public EnhancementPattern() {
	}

	public EnhancementPattern(String name, String desc, int wisdom, int strength, int luck, int dexterity, int endurance, int intelligence, Date lastModified) {
		this.name = name;
		this.desc = desc;
		this.wisdom = wisdom;
		this.strength = strength;
		this.luck = luck;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.intelligence = intelligence;
		this.lastModified = lastModified;
	}

	public EnhancementPattern(
		String name, String desc, int wisdom, int strength, int luck, int dexterity, int endurance, int intelligence, Date lastModified, Set enhancements
	) {
		this.name = name;
		this.desc = desc;
		this.wisdom = wisdom;
		this.strength = strength;
		this.luck = luck;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.intelligence = intelligence;
		this.lastModified = lastModified;
		this.enhancements = enhancements;
	}

	public Map<String, Double> getStats() {
		if (!this.patterns.isEmpty()) {
			return this.patterns;
		} else {
			this.patterns.put("WIS", (double) this.getWisdom());
			this.patterns.put("END", (double) this.getEndurance());
			this.patterns.put("LCK", (double) this.getLuck());
			this.patterns.put("STR", (double) this.getStrength());
			this.patterns.put("DEX", (double) this.getDexterity());
			this.patterns.put("INT", (double) this.getIntelligence());
			return this.patterns;
		}
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getWisdom() {
		return this.wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLuck() {
		return this.luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getDexterity() {
		return this.dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getEndurance() {
		return this.endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getIntelligence() {
		return this.intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<Enhancement> getEnhancements() {
		return this.enhancements;
	}

	public void setEnhancements(Set<Enhancement> enhancements) {
		this.enhancements = enhancements;
	}

}

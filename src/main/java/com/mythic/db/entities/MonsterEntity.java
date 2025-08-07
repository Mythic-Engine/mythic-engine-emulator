/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MonsterEntity implements Serializable {

	private Integer id;
	private String name;
	private String race;
	private String file;
	private String linkage;
	private String element;
	private int level;
	private int health;
	private int mana;
	private int gold;
	private int experience;
	private int reputation;
	private int dps;
	private boolean teamId;
	private Date lastModified;
	private Set<MonsterDrop> monsterDrops = new HashSet<>(0);
	private Set<MapMonster> mapMonsters = new HashSet<>(0);

	public MonsterEntity() {
	}

	public MonsterEntity(
		String name,
		String race,
		String file,
		String linkage,
		String element,
		int level,
		int health,
		int mana,
		int gold,
		int experience,
		int reputation,
		int dps,
		boolean teamId,
		Date lastModified
	) {
		this.name = name;
		this.race = race;
		this.file = file;
		this.linkage = linkage;
		this.element = element;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.gold = gold;
		this.experience = experience;
		this.reputation = reputation;
		this.dps = dps;
		this.teamId = teamId;
		this.lastModified = lastModified;
	}

	public MonsterEntity(
		String name,
		String race,
		String file,
		String linkage,
		String element,
		int level,
		int health,
		int mana,
		int gold,
		int experience,
		int reputation,
		int dps,
		boolean teamId,
		Date lastModified,
		Set mapMonsters,
		Set monsterDrops
	) {
		this.name = name;
		this.race = race;
		this.file = file;
		this.linkage = linkage;
		this.element = element;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.gold = gold;
		this.experience = experience;
		this.reputation = reputation;
		this.dps = dps;
		this.teamId = teamId;
		this.lastModified = lastModified;
		this.mapMonsters = mapMonsters;
		this.monsterDrops = monsterDrops;
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

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLinkage() {
		return this.linkage;
	}

	public void setLinkage(String linkage) {
		this.linkage = linkage;
	}

	public String getElement() {
		return this.element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return this.mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getGold() {
		return this.gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getReputation() {
		return this.reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getDps() {
		return this.dps;
	}

	public void setDps(int dps) {
		this.dps = dps;
	}

	public boolean isTeamId() {
		return this.teamId;
	}

	public void setTeamId(boolean teamId) {
		this.teamId = teamId;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<MonsterDrop> getMonsterDrops() {
		return this.monsterDrops;
	}

	public void setMonsterDrops(Set<MonsterDrop> monsterDrops) {
		this.monsterDrops = monsterDrops;
	}

	public Set<MapMonster> getMapMonsters() {
		return this.mapMonsters;
	}

	public void setMapMonsters(Set<MapMonster> mapMonsters) {
		this.mapMonsters = mapMonsters;
	}

}

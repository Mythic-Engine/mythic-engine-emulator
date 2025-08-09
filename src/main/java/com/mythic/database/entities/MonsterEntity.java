package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "monsters")
public class MonsterEntity extends EntityBase {

	@Column(name = "Name", nullable = false, length = 16)
	private String name;

	@Column(name = "Race", nullable = false, length = 16)
	private String race;

	@Column(name = "File", nullable = false, length = 128)
	private String file;

	@Column(name = "Linkage", nullable = false, length = 32)
	private String linkage;

	@Column(name = "Element", nullable = false, length = 8)
	private String element;

	@Column(name = "Level", nullable = false)
	private Integer level;

	@Column(name = "Health", nullable = false)
	private Integer health;

	@Column(name = "Mana", nullable = false)
	private Integer mana;

	@Column(name = "Gold", nullable = false)
	private Integer gold;

	@Column(name = "Experience", nullable = false)
	private Integer experience;

	@Column(name = "Reputation", nullable = false)
	private Integer reputation;

	@Column(name = "DPS", nullable = false)
	private Integer dps;

	@Column(name = "TeamID", nullable = false)
	private Boolean teamID = false;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

	public String getName() {
		return name;
	}

	public MonsterEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getRace() {
		return race;
	}

	public MonsterEntity setRace(String race) {
		this.race = race;
		return this;
	}

	public String getFile() {
		return file;
	}

	public MonsterEntity setFile(String file) {
		this.file = file;
		return this;
	}

	public String getLinkage() {
		return linkage;
	}

	public MonsterEntity setLinkage(String linkage) {
		this.linkage = linkage;
		return this;
	}

	public String getElement() {
		return element;
	}

	public MonsterEntity setElement(String element) {
		this.element = element;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public MonsterEntity setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Integer getHealth() {
		return health;
	}

	public MonsterEntity setHealth(Integer health) {
		this.health = health;
		return this;
	}

	public Integer getMana() {
		return mana;
	}

	public MonsterEntity setMana(Integer mana) {
		this.mana = mana;
		return this;
	}

	public Integer getGold() {
		return gold;
	}

	public MonsterEntity setGold(Integer gold) {
		this.gold = gold;
		return this;
	}

	public Integer getExperience() {
		return experience;
	}

	public MonsterEntity setExperience(Integer experience) {
		this.experience = experience;
		return this;
	}

	public Integer getReputation() {
		return reputation;
	}

	public MonsterEntity setReputation(Integer reputation) {
		this.reputation = reputation;
		return this;
	}

	public Integer getDps() {
		return dps;
	}

	public MonsterEntity setDps(Integer dps) {
		this.dps = dps;
		return this;
	}

	public Boolean getTeamID() {
		return teamID;
	}

	public MonsterEntity setTeamID(Boolean teamID) {
		this.teamID = teamID;
		return this;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public MonsterEntity setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
		return this;
	}

}
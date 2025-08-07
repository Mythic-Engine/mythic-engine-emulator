package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "monsters")
public class Monster {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLinkage() {
		return linkage;
	}

	public void setLinkage(String linkage) {
		this.linkage = linkage;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getDps() {
		return dps;
	}

	public void setDps(Integer dps) {
		this.dps = dps;
	}

	public Boolean getTeamID() {
		return teamID;
	}

	public void setTeamID(Boolean teamID) {
		this.teamID = teamID;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}
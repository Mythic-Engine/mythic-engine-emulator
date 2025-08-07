package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "enhancements")
public class Enhancement {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "PatternID", nullable = false)
	private Integer patternID;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "Rarity", nullable = false)
	private Integer rarity;

	@Column(name = "DPS", nullable = false)
	private Integer dps;

	@Column(name = "Level", nullable = false)
	private Integer level;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPatternID() {
		return patternID;
	}

	public void setPatternID(Integer patternID) {
		this.patternID = patternID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	public Integer getDps() {
		return dps;
	}

	public void setDps(Integer dps) {
		this.dps = dps;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}
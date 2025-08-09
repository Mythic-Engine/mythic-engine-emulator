package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "enhancements")
public class Enhancement extends EntityBase {

	@Column(name = "PatternID", nullable = false)
	private Integer pattern;

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

	public Integer getPattern() {
		return pattern;
	}

	public Enhancement setPattern(Integer pattern) {
		this.pattern = pattern;
		return this;
	}

	public String getName() {
		return name;
	}

	public Enhancement setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getRarity() {
		return rarity;
	}

	public Enhancement setRarity(Integer rarity) {
		this.rarity = rarity;
		return this;
	}

	public Integer getDps() {
		return dps;
	}

	public Enhancement setDps(Integer dps) {
		this.dps = dps;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public Enhancement setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public Enhancement setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
		return this;
	}

}
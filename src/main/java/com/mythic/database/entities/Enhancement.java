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

}
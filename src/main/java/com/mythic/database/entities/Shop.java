package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "shops")
public class Shop extends EntityBase {

	@Column(name = "AchievementIndexID", nullable = false)
	private Integer achievementIndexID;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "House", nullable = false)
	private Boolean house = false;

	@Column(name = "Upgrade", nullable = false)
	private Boolean upgrade = false;

	@Column(name = "Staff", nullable = false)
	private Boolean staff = false;

	@Column(name = "Limited", nullable = false)
	private Boolean limited = false;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

}
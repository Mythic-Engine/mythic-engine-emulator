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

}
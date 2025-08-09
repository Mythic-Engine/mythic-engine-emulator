package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "guilds")
public class Guild extends EntityBase {

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Column(name = "MessageOfTheDay", nullable = false, length = 512)
	private String messageOfTheDay;

	@Column(name = "MaxMembers", nullable = false)
	private Integer maxMembers;

	@Column(name = "HallSize", nullable = false)
	private Integer hallSize;

	@Column(name = "LastUpdated", nullable = false)
	private Instant lastUpdated;

}
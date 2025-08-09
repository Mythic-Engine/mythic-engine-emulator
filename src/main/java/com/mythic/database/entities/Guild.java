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

	public String getName() {
		return name;
	}

	public Guild setName(String name) {
		this.name = name;
		return this;
	}

	public String getMessageOfTheDay() {
		return messageOfTheDay;
	}

	public Guild setMessageOfTheDay(String messageOfTheDay) {
		this.messageOfTheDay = messageOfTheDay;
		return this;
	}

	public Integer getMaxMembers() {
		return maxMembers;
	}

	public Guild setMaxMembers(Integer maxMembers) {
		this.maxMembers = maxMembers;
		return this;
	}

	public Integer getHallSize() {
		return hallSize;
	}

	public Guild setHallSize(Integer hallSize) {
		this.hallSize = hallSize;
		return this;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public Guild setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
		return this;
	}

}
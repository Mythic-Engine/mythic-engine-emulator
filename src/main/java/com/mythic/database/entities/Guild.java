package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "guilds")
public class Guild {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public String getMessageOfTheDay() {
		return messageOfTheDay;
	}

	public void setMessageOfTheDay(String messageOfTheDay) {
		this.messageOfTheDay = messageOfTheDay;
	}

	public Integer getMaxMembers() {
		return maxMembers;
	}

	public void setMaxMembers(Integer maxMembers) {
		this.maxMembers = maxMembers;
	}

	public Integer getHallSize() {
		return hallSize;
	}

	public void setHallSize(Integer hallSize) {
		this.hallSize = hallSize;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
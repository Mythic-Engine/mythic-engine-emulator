package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "shops")
public class Shop {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAchievementIndexID() {
		return achievementIndexID;
	}

	public void setAchievementIndexID(Integer achievementIndexID) {
		this.achievementIndexID = achievementIndexID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHouse() {
		return house;
	}

	public void setHouse(Boolean house) {
		this.house = house;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
	}

	public Boolean getStaff() {
		return staff;
	}

	public void setStaff(Boolean staff) {
		this.staff = staff;
	}

	public Boolean getLimited() {
		return limited;
	}

	public void setLimited(Boolean limited) {
		this.limited = limited;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}
package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
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

	public Integer getAchievementIndexID() {
		return achievementIndexID;
	}

	public Shop setAchievementIndexID(Integer achievementIndexID) {
		this.achievementIndexID = achievementIndexID;
		return this;
	}

	public String getName() {
		return name;
	}

	public Shop setName(String name) {
		this.name = name;
		return this;
	}

	public Boolean getHouse() {
		return house;
	}

	public Shop setHouse(Boolean house) {
		this.house = house;
		return this;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public Shop setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
		return this;
	}

	public Boolean getStaff() {
		return staff;
	}

	public Shop setStaff(Boolean staff) {
		this.staff = staff;
		return this;
	}

	public Boolean getLimited() {
		return limited;
	}

	public Shop setLimited(Boolean limited) {
		this.limited = limited;
		return this;
	}

}
/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Shop implements Serializable {

	private Integer id;
	private AchievementIndex achievementIndex;
	private String name;
	private boolean house;
	private boolean upgrade;
	private boolean staff;
	private boolean limited;
	private Date lastModified;
	private Set<ShopItem> shopItems = new HashSet<>(0);
	private Set<MapEntity> mapEntities = new HashSet<>(0);

	public Shop() {
	}

	public Shop(AchievementIndex achievementIndex, String name, boolean house, boolean upgrade, boolean staff, boolean limited, Date lastModified) {
		this.achievementIndex = achievementIndex;
		this.name = name;
		this.house = house;
		this.upgrade = upgrade;
		this.staff = staff;
		this.limited = limited;
		this.lastModified = lastModified;
	}

	public Shop(
		AchievementIndex achievementIndex,
		String name,
		boolean house,
		boolean upgrade,
		boolean staff,
		boolean limited,
		Date lastModified,
		Set shopItems,
		Set mapEntities
	) {
		this.achievementIndex = achievementIndex;
		this.name = name;
		this.house = house;
		this.upgrade = upgrade;
		this.staff = staff;
		this.limited = limited;
		this.lastModified = lastModified;
		this.shopItems = shopItems;
		this.mapEntities = mapEntities;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AchievementIndex getAchievementIndex() {
		return this.achievementIndex;
	}

	public void setAchievementIndex(AchievementIndex achievementIndex) {
		this.achievementIndex = achievementIndex;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHouse() {
		return this.house;
	}

	public void setHouse(boolean house) {
		this.house = house;
	}

	public boolean isUpgrade() {
		return this.upgrade;
	}

	public void setUpgrade(boolean upgrade) {
		this.upgrade = upgrade;
	}

	public boolean isStaff() {
		return this.staff;
	}

	public void setStaff(boolean staff) {
		this.staff = staff;
	}

	public boolean isLimited() {
		return this.limited;
	}

	public void setLimited(boolean limited) {
		this.limited = limited;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<ShopItem> getShopItems() {
		return this.shopItems;
	}

	public void setShopItems(Set<ShopItem> shopItems) {
		this.shopItems = shopItems;
	}

	public Set<MapEntity> getMapEntities() {
		return this.mapEntities;
	}

	public void setMapEntities(Set<MapEntity> mapEntities) {
		this.mapEntities = mapEntities;
	}

}

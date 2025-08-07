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

public class Hair implements Serializable {

	private Integer id;
	private String gender;
	private String name;
	private String file;
	private Set<HairShopItem> hairShopItems = new HashSet<>(0);
	private Set<UserEntity> userEntities = new HashSet<>(0);
	private Date lastModified;

	public Hair() {
	}

	public Hair(String gender, String name, String file) {
		this.gender = gender;
		this.name = name;
		this.file = file;
	}

	public Hair(String gender, String name, String file, Set hairShopItems, Set userEntities) {
		this.gender = gender;
		this.name = name;
		this.file = file;
		this.hairShopItems = hairShopItems;
		this.userEntities = userEntities;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Set<HairShopItem> getHairShopItems() {
		return this.hairShopItems;
	}

	public void setHairShopItems(Set<HairShopItem> hairShopItems) {
		this.hairShopItems = hairShopItems;
	}

	public Set<UserEntity> getUserEntities() {
		return this.userEntities;
	}

	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}

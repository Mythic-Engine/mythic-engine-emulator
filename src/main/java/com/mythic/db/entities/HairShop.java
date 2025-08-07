/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class HairShop implements Serializable {

	private Integer id;
	private String name;
	private Set<HairShopItem> hairShopItems = new HashSet<>(0);

	public HairShop() {
	}

	public HairShop(String name) {
		this.name = name;
	}

	public HairShop(String name, Set hairShopItems) {
		this.name = name;
		this.hairShopItems = hairShopItems;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<HairShopItem> getHairShopItems() {
		return this.hairShopItems;
	}

	public void setHairShopItems(Set<HairShopItem> hairShopItems) {
		this.hairShopItems = hairShopItems;
	}

}

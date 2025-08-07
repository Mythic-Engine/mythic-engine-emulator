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

public class ItemType implements Serializable {

	private Integer id;
	private Equipspot equipspot;
	private String name;
	private String icon;
	private Set<Item> items = new HashSet<>(0);

	public ItemType() {
	}

	public ItemType(Equipspot equipspot, String name, String icon) {
		this.equipspot = equipspot;
		this.name = name;
		this.icon = icon;
	}

	public ItemType(Equipspot equipspot, String name, String icon, Set items) {
		this.equipspot = equipspot;
		this.name = name;
		this.icon = icon;
		this.items = items;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Equipspot getEquipspot() {
		return this.equipspot;
	}

	public void setEquipspot(Equipspot equipspot) {
		this.equipspot = equipspot;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}

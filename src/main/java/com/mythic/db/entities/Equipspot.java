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

public class Equipspot implements Serializable {

	private Integer id;
	private String name;
	private Set<ItemType> itemTypes = new HashSet<>(0);

	public Equipspot() {
	}

	public Equipspot(String name) {
		this.name = name;
	}

	public Equipspot(String name, Set itemTypes) {
		this.name = name;
		this.itemTypes = itemTypes;
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

	public Set<ItemType> getItemTypes() {
		return this.itemTypes;
	}

	public void setItemTypes(Set<ItemType> itemTypes) {
		this.itemTypes = itemTypes;
	}

}

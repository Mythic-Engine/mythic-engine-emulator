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

public class BoostType implements Serializable {

	private Integer id;
	private String name;
	private Set<UserBoost> userBoosts = new HashSet<>(0);

	public BoostType() {
	}

	public BoostType(String name) {
		this.name = name;
	}

	public BoostType(String name, Set userBoosts) {
		this.name = name;
		this.userBoosts = userBoosts;
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

	public Set<UserBoost> getUserBoosts() {
		return this.userBoosts;
	}

	public void setUserBoosts(Set<UserBoost> userBoosts) {
		this.userBoosts = userBoosts;
	}

}

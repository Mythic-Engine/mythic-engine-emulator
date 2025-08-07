/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class UserFaction implements Serializable {

	private Integer id;
	private UserEntity userEntity;
	private Faction faction;
	private int reputation;

	public UserFaction() {
	}

	public UserFaction(UserEntity userEntity, Faction faction, int reputation) {
		this.userEntity = userEntity;
		this.faction = faction;
		this.reputation = reputation;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public Faction getFaction() {
		return this.faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public int getReputation() {
		return this.reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

}

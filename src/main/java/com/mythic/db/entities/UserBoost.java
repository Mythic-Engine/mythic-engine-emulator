/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;

public class UserBoost implements Serializable {

	private Integer id;
	private UserEntity userEntity;
	private BoostType boostType;
	private Date dateEnd;

	public UserBoost() {
	}

	public UserBoost(UserEntity userEntity, BoostType boostType, Date dateEnd) {
		this.userEntity = userEntity;
		this.boostType = boostType;
		this.dateEnd = dateEnd;
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

	public BoostType getBoostType() {
		return this.boostType;
	}

	public void setBoostType(BoostType boostType) {
		this.boostType = boostType;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

}

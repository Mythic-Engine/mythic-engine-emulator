/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;

public class UserIP implements Serializable {

	private UserIPId id;
	private UserEntity userEntity;
	private Date lastUsed;

	public UserIP() {
	}

	public UserIP(UserIPId id, UserEntity userEntity, Date lastUsed) {
		this.id = id;
		this.userEntity = userEntity;
		this.lastUsed = lastUsed;
	}

	public UserIPId getId() {
		return this.id;
	}

	public void setId(UserIPId id) {
		this.id = id;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public Date getLastUsed() {
		return this.lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

}

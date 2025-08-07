/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;

public class UserBan implements Serializable {

	private int userId;
	private UserEntity userEntity;
	private BanType banType;
	private Date startDate;
	private Date endDate;

	public UserBan() {
	}

	public UserBan(UserEntity userEntity, BanType banType, Date startDate, Date endDate) {
		this.userEntity = userEntity;
		this.banType = banType;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public BanType getBanType() {
		return this.banType;
	}

	public void setBanType(BanType banType) {
		this.banType = banType;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;

public class UserLog implements Serializable {

	private Integer id;
	private LogType logType;
	private UserEntity userEntity;
	private String details;
	private Date date;

	public UserLog() {
	}

	public UserLog(LogType logType, UserEntity userEntity, String details, Date date) {
		this.logType = logType;
		this.userEntity = userEntity;
		this.details = details;
		this.date = date;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LogType getLogType() {
		return this.logType;
	}

	public void setLogType(LogType logType) {
		this.logType = logType;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

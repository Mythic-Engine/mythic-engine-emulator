/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;

public class UserTransaction implements Serializable {

	private Integer id;
	private UserEntity userEntity;
	private TransactionType transactionType;
	private String details;
	private Date transactionDate;

	public UserTransaction() {
	}

	public UserTransaction(UserEntity userEntity, TransactionType transactionType, String details, Date transactionDate) {
		this.userEntity = userEntity;
		this.transactionType = transactionType;
		this.details = details;
		this.transactionDate = transactionDate;
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

	public TransactionType getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}

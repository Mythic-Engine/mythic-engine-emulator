package com.mythic.database.entities;

import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_transactions")
public class UserTransaction extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeTransactionID", nullable = false)
	private TypeTransaction TypeTransactionID;

	@Lob
	@Column(name = "Details", nullable = false)
	private String details;

	public TypeTransaction getTypeTransactionID() {
		return TypeTransactionID;
	}

	public UserTransaction setTypeTransactionID(TypeTransaction typeTransactionID) {
		TypeTransactionID = typeTransactionID;
		return this;
	}

	public String getDetails() {
		return details;
	}

	public UserTransaction setDetails(String details) {
		this.details = details;
		return this;
	}

}
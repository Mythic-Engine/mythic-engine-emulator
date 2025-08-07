package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_transactions")
public class UsersTransaction {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TransactionTypeID", nullable = false)
	private TypesTransaction transactionTypeID;

	@Lob
	@Column(name = "Details", nullable = false)
	private String details;

	@Column(name = "TransactionDate", nullable = false)
	private Instant transactionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public TypesTransaction getTransactionTypeID() {
		return transactionTypeID;
	}

	public void setTransactionTypeID(TypesTransaction transactionTypeID) {
		this.transactionTypeID = transactionTypeID;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Instant getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Instant transactionDate) {
		this.transactionDate = transactionDate;
	}

}
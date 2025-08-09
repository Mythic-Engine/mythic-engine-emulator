package com.mythic.database.entities;

import com.mythic.database.base.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_logs")
public class UserLog extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "typeLogID", nullable = false)
	private TypeLog typeLogID;

	@Lob
	@Column(name = "Details", nullable = false)
	private String details;

	@Column(name = "Date", nullable = false)
	private Instant date;

	public TypeLog getTypeLogID() {
		return typeLogID;
	}

	public UserLog setTypeLogID(TypeLog typeLogID) {
		this.typeLogID = typeLogID;
		return this;
	}

	public String getDetails() {
		return details;
	}

	public UserLog setDetails(String details) {
		this.details = details;
		return this;
	}

	public Instant getDate() {
		return date;
	}

	public UserLog setDate(Instant date) {
		this.date = date;
		return this;
	}

}
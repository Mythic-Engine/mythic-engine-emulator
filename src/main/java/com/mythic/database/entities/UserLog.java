package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_logs")
public class UserLog {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "LogTypeID", nullable = false)
	private TypeLog logTypeID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@Lob
	@Column(name = "Details", nullable = false)
	private String details;

	@Column(name = "Date", nullable = false)
	private Instant date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TypeLog getLogTypeID() {
		return logTypeID;
	}

	public void setLogTypeID(TypeLog logTypeID) {
		this.logTypeID = logTypeID;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

}
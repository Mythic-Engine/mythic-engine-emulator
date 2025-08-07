package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_ips")
public class UserIp {

	@EmbeddedId
	private UserIpId id;

	@MapsId("userID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@Column(name = "LastUsed", nullable = false)
	private Instant lastUsed;

	public UserIpId getId() {
		return id;
	}

	public void setId(UserIpId id) {
		this.id = id;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public Instant getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Instant lastUsed) {
		this.lastUsed = lastUsed;
	}

}
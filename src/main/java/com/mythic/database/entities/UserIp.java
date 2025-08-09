package com.mythic.database.entities;

import com.mythic.database.base.UserEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "users_ips")
public class UserIp extends UserEntityBase {

	@Column(name = "LastUsed", nullable = false)
	private Instant lastUsed;

	public Instant getLastUsed() {
		return lastUsed;
	}

	public UserIp setLastUsed(Instant lastUsed) {
		this.lastUsed = lastUsed;
		return this;
	}

}
package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_ips")
public class UserIp extends UserEntityBase {

	@Column(name = "LastUsed", nullable = false)
	private Instant lastUsed;

}
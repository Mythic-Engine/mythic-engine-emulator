package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
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

}
package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_boosts")
public class UserBoost extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeBoostID", nullable = false)
	private TypeBoost typeBoost;

	@Column(name = "DateEnd", nullable = false)
	private Instant dateEnd;

}
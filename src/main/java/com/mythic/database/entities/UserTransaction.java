package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_transactions")
public class UserTransaction extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeTransactionID", nullable = false)
	private TypeTransaction TypeTransactionID;

	@Lob
	@Column(name = "Details", nullable = false)
	private String details;

}
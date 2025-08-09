package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_items")
public class UserItem extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EnhID", nullable = false)
	private Enhancement enhancement;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@Column(name = "Equipped", nullable = false)
	private Boolean equipped = false;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	@Column(name = "Bank", nullable = false)
	private Boolean bank = false;

}
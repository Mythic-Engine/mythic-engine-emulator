package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_boosts")
public class UserBoost {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "BoostTypeID", nullable = false)
	private TypeBoost boostTypeID;

	@Column(name = "DateEnd", nullable = false)
	private Instant dateEnd;

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

	public TypeBoost getBoostTypeID() {
		return boostTypeID;
	}

	public void setBoostTypeID(TypeBoost boostTypeID) {
		this.boostTypeID = boostTypeID;
	}

	public Instant getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Instant dateEnd) {
		this.dateEnd = dateEnd;
	}

}
package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_bans")
public class UserBan {

	@Id
	@Column(name = "UserID", nullable = false)
	private Integer id;

	@MapsId
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User users;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "BanTypeID", nullable = false)
	private TypeBan banTypeID;

	@Column(name = "StartDate", nullable = false)
	private Instant startDate;

	@Column(name = "EndDate", nullable = false)
	private Instant endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public TypeBan getBanTypeID() {
		return banTypeID;
	}

	public void setBanTypeID(TypeBan banTypeID) {
		this.banTypeID = banTypeID;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}

}
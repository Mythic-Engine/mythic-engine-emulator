package com.mythic.database.entities;

import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_bans")
public class UserBan extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeBanID", nullable = false)
	private TypeBan typeBan;

	@Column(name = "StartDate", nullable = false)
	private Instant startDate;

	@Column(name = "EndDate", nullable = false)
	private Instant endDate;

	public TypeBan getTypeBan() {
		return typeBan;
	}

	public UserBan setTypeBan(TypeBan typeBan) {
		this.typeBan = typeBan;
		return this;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public UserBan setStartDate(Instant startDate) {
		this.startDate = startDate;
		return this;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public UserBan setEndDate(Instant endDate) {
		this.endDate = endDate;
		return this;
	}

}
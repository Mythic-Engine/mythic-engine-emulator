package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users_factions")
public class UserFaction {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction factionID;

	@Column(name = "Reputation", nullable = false)
	private Integer reputation;

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

	public Faction getFactionID() {
		return factionID;
	}

	public void setFactionID(Faction factionID) {
		this.factionID = factionID;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

}
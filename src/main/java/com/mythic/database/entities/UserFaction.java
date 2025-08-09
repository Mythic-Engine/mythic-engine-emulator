package com.mythic.database.entities;

import com.mythic.database.base.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_factions")
public class UserFaction extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction faction;

	@Column(name = "Reputation", nullable = false)
	private Integer reputation;

	public Faction getFaction() {
		return faction;
	}

	public UserFaction setFaction(Faction faction) {
		this.faction = faction;
		return this;
	}

	public Integer getReputation() {
		return reputation;
	}

	public UserFaction setReputation(Integer reputation) {
		this.reputation = reputation;
		return this;
	}

}
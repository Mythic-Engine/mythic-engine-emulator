package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_factions")
public class UserFaction extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction faction;

	@Column(name = "Reputation", nullable = false)
	private Integer reputation;

}
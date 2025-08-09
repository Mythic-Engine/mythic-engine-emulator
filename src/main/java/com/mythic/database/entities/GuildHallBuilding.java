package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls_buildings")
public class GuildHallBuilding extends EntityBase {

	@Column(name = "ItemID", nullable = false)
	private Integer item;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HallID", nullable = false)
	private GuildHall hall;

	@Column(name = "Slot", nullable = false)
	private Integer slot;

}
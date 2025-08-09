package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls_connections")
public class GuildHallConnection extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HallID", nullable = false)
	private GuildHall hall;

	@Column(name = "Pad", nullable = false, length = 16)
	private String pad;

	@Column(name = "Cell", nullable = false, length = 16)
	private String cell;

	@Column(name = "PadPosition", nullable = false, length = 16)
	private String padPosition;

}
package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
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

	public GuildHall getHall() {
		return hall;
	}

	public GuildHallConnection setHall(GuildHall hall) {
		this.hall = hall;
		return this;
	}

	public String getPad() {
		return pad;
	}

	public GuildHallConnection setPad(String pad) {
		this.pad = pad;
		return this;
	}

	public String getCell() {
		return cell;
	}

	public GuildHallConnection setCell(String cell) {
		this.cell = cell;
		return this;
	}

	public String getPadPosition() {
		return padPosition;
	}

	public GuildHallConnection setPadPosition(String padPosition) {
		this.padPosition = padPosition;
		return this;
	}

}
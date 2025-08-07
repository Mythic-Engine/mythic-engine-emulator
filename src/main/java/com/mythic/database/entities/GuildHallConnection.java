package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls_connections")
public class GuildHallConnection {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HallID", nullable = false)
	private GuildHall hallID;

	@Column(name = "Pad", nullable = false, length = 16)
	private String pad;

	@Column(name = "Cell", nullable = false, length = 16)
	private String cell;

	@Column(name = "PadPosition", nullable = false, length = 16)
	private String padPosition;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GuildHall getHallID() {
		return hallID;
	}

	public void setHallID(GuildHall hallID) {
		this.hallID = hallID;
	}

	public String getPad() {
		return pad;
	}

	public void setPad(String pad) {
		this.pad = pad;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getPadPosition() {
		return padPosition;
	}

	public void setPadPosition(String padPosition) {
		this.padPosition = padPosition;
	}

}
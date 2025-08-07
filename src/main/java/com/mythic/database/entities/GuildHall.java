package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls")
public class GuildHall {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "GuildID", nullable = false)
	private Guild guildID;

	@Column(name = "Linkage", nullable = false, length = 64)
	private String linkage;

	@Column(name = "Cell", nullable = false, length = 16)
	private String cell;

	@Column(name = "X", nullable = false)
	private Float x;

	@Column(name = "Y", nullable = false)
	private Float y;

	@Lob
	@Column(name = "Interior", nullable = false)
	private String interior;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Guild getGuildID() {
		return guildID;
	}

	public void setGuildID(Guild guildID) {
		this.guildID = guildID;
	}

	public String getLinkage() {
		return linkage;
	}

	public void setLinkage(String linkage) {
		this.linkage = linkage;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public Float getX() {
		return x;
	}

	public void setX(Float x) {
		this.x = x;
	}

	public Float getY() {
		return y;
	}

	public void setY(Float y) {
		this.y = y;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

}
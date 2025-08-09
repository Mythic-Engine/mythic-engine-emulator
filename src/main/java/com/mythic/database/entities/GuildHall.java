package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls")
public class GuildHall extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "GuildID", nullable = false)
	private Guild guild;

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

	public Guild getGuild() {
		return guild;
	}

	public GuildHall setGuild(Guild guild) {
		this.guild = guild;
		return this;
	}

	public String getLinkage() {
		return linkage;
	}

	public GuildHall setLinkage(String linkage) {
		this.linkage = linkage;
		return this;
	}

	public String getCell() {
		return cell;
	}

	public GuildHall setCell(String cell) {
		this.cell = cell;
		return this;
	}

	public Float getX() {
		return x;
	}

	public GuildHall setX(Float x) {
		this.x = x;
		return this;
	}

	public Float getY() {
		return y;
	}

	public GuildHall setY(Float y) {
		this.y = y;
		return this;
	}

	public String getInterior() {
		return interior;
	}

	public GuildHall setInterior(String interior) {
		this.interior = interior;
		return this;
	}

}
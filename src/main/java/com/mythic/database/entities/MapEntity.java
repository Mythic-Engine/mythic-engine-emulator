package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "maps")
public class MapEntity extends EntityBase {

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "File", nullable = false, length = 128)
	private String file;

	@Column(name = "MaxPlayers", nullable = false)
	private Integer maxPlayers;

	@Column(name = "ReqLevel", nullable = false)
	private Integer reqLevel;

	@Column(name = "Upgrade", nullable = false)
	private Boolean upgrade = false;

	@Column(name = "Staff", nullable = false)
	private Boolean staff = false;

	@Column(name = "PvP", nullable = false)
	private Boolean pvP = false;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

	public String getName() {
		return name;
	}

	public MapEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getFile() {
		return file;
	}

	public MapEntity setFile(String file) {
		this.file = file;
		return this;
	}

	public Integer getMaxPlayers() {
		return maxPlayers;
	}

	public MapEntity setMaxPlayers(Integer maxPlayers) {
		this.maxPlayers = maxPlayers;
		return this;
	}

	public Integer getReqLevel() {
		return reqLevel;
	}

	public MapEntity setReqLevel(Integer reqLevel) {
		this.reqLevel = reqLevel;
		return this;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public MapEntity setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
		return this;
	}

	public Boolean getStaff() {
		return staff;
	}

	public MapEntity setStaff(Boolean staff) {
		this.staff = staff;
		return this;
	}

	public Boolean getPvP() {
		return pvP;
	}

	public MapEntity setPvP(Boolean pvP) {
		this.pvP = pvP;
		return this;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public MapEntity setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
		return this;
	}

}
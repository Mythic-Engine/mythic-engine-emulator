package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "maps")
public class Map {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Integer getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(Integer maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public Integer getReqLevel() {
		return reqLevel;
	}

	public void setReqLevel(Integer reqLevel) {
		this.reqLevel = reqLevel;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
	}

	public Boolean getStaff() {
		return staff;
	}

	public void setStaff(Boolean staff) {
		this.staff = staff;
	}

	public Boolean getPvP() {
		return pvP;
	}

	public void setPvP(Boolean pvP) {
		this.pvP = pvP;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}
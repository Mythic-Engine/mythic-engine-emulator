package com.mythic.database.entities;

import com.mythic.database.EntityBase;
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

}
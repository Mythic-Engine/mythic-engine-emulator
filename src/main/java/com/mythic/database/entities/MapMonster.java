package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "maps_monsters")
public class MapMonster extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private MonsterEntity monsterID;

	@Column(name = "Frame", nullable = false, length = 16)
	private String frame;

	@Column(name = "MonMapID", nullable = false)
	private Integer monMapID;

}
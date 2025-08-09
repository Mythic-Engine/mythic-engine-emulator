package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "maps_cells")
public class MapCell extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity map;

	@Column(name = "Frame", nullable = false, length = 16)
	private String frame;

	@Column(name = "Pad", nullable = false, length = 16)
	private String pad;

}
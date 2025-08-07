package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "maps_cells")
public class MapCell {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@Column(name = "Frame", nullable = false, length = 16)
	private String frame;

	@Column(name = "Pad", nullable = false, length = 16)
	private String pad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MapEntity getMapID() {
		return mapID;
	}

	public void setMapID(MapEntity mapID) {
		this.mapID = mapID;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getPad() {
		return pad;
	}

	public void setPad(String pad) {
		this.pad = pad;
	}

}
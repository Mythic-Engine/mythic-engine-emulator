package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls_buildings")
public class GuildsHallsBuilding {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HallID", nullable = false)
	private GuildsHall hallID;

	@Column(name = "Slot", nullable = false)
	private Integer slot;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public GuildsHall getHallID() {
		return hallID;
	}

	public void setHallID(GuildsHall hallID) {
		this.hallID = hallID;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

}
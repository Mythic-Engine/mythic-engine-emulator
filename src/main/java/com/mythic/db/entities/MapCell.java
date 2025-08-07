/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class MapCell implements Serializable {

	private Integer id;
	private MapEntity mapEntity;
	private String frame;
	private String pad;

	public MapCell() {
	}

	public MapCell(MapEntity mapEntity, String frame, String pad) {
		this.mapEntity = mapEntity;
		this.frame = frame;
		this.pad = pad;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MapEntity getMapEntity() {
		return this.mapEntity;
	}

	public void setMapEntity(MapEntity mapEntity) {
		this.mapEntity = mapEntity;
	}

	public String getFrame() {
		return this.frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getPad() {
		return this.pad;
	}

	public void setPad(String pad) {
		this.pad = pad;
	}

}

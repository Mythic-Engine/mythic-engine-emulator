/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class MapMonsterId implements Serializable {

	private int mapId;
	private int monsterId;
	private int monMapId;
	private String frame;

	public MapMonsterId() {
	}

	public MapMonsterId(int mapId, int monsterId, int monMapId, String frame) {
		this.mapId = mapId;
		this.monsterId = monsterId;
		this.monMapId = monMapId;
		this.frame = frame;
	}

	public int getMapId() {
		return this.mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public int getMonsterId() {
		return this.monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public int getMonMapId() {
		return this.monMapId;
	}

	public void setMonMapId(int monMapId) {
		this.monMapId = monMapId;
	}

	public String getFrame() {
		return this.frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else if (!(other instanceof MapMonsterId castOther)) {
			return false;
		} else {
			return this.getMapId() == castOther.getMapId()
				&& this.getMonsterId() == castOther.getMonsterId()
				&& this.getMonMapId() == castOther.getMonMapId()
				&& (
				this.getFrame() == castOther.getFrame()
					|| this.getFrame() != null && castOther.getFrame() != null && this.getFrame().equals(castOther.getFrame())
			);
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getMapId();
		result = 37 * result + this.getMonsterId();
		result = 37 * result + this.getMonMapId();
		return 37 * result + (this.getFrame() == null ? 0 : this.getFrame().hashCode());
	}

}

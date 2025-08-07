/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class MonsterDropId implements Serializable {

	private int monsterId;
	private int itemId;

	public MonsterDropId() {
	}

	public MonsterDropId(int monsterId, int itemId) {
		this.monsterId = monsterId;
		this.itemId = itemId;
	}

	public int getMonsterId() {
		return this.monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else if (!(other instanceof MonsterDropId castOther)) {
			return false;
		} else {
			return this.getMonsterId() == castOther.getMonsterId() && this.getItemId() == castOther.getItemId();
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getMonsterId();
		return 37 * result + this.getItemId();
	}

}

/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class ItemRequirementId implements Serializable {

	private int itemId;
	private int reqItemId;

	public ItemRequirementId() {
	}

	public ItemRequirementId(int itemId, int reqItemId) {
		this.itemId = itemId;
		this.reqItemId = reqItemId;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getReqItemId() {
		return this.reqItemId;
	}

	public void setReqItemId(int reqItemId) {
		this.reqItemId = reqItemId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else if (!(other instanceof ItemRequirementId castOther)) {
			return false;
		} else {
			return this.getItemId() == castOther.getItemId() && this.getReqItemId() == castOther.getReqItemId();
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getItemId();
		return 37 * result + this.getReqItemId();
	}

}

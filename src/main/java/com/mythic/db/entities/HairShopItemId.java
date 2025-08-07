/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Objects;

public class HairShopItemId implements Serializable {

	private String gender;
	private int shopId;
	private int hairId;

	public HairShopItemId() {
	}

	public HairShopItemId(String gender, int shopId, int hairId) {
		this.gender = gender;
		this.shopId = shopId;
		this.hairId = hairId;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getShopId() {
		return this.shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getHairId() {
		return this.hairId;
	}

	public void setHairId(int hairId) {
		this.hairId = hairId;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 83 * hash + (this.gender != null ? this.gender.hashCode() : 0);
		hash = 83 * hash + this.shopId;
		return 83 * hash + this.hairId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			HairShopItemId other = (HairShopItemId) obj;
			if (Objects.equals(this.gender, other.gender)) {
				return this.shopId == other.shopId && this.hairId == other.hairId;
			} else {
				return false;
			}
		}
	}

}

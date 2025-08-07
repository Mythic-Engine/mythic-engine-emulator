/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class HairShopItem implements Serializable {

	private HairShopItemId id;
	private HairShop hairShop;
	private Hair hair;

	public HairShopItem() {
	}

	public HairShopItem(HairShopItemId id, HairShop hairShop, Hair hair) {
		this.id = id;
		this.hairShop = hairShop;
		this.hair = hair;
	}

	public HairShopItemId getId() {
		return this.id;
	}

	public void setId(HairShopItemId id) {
		this.id = id;
	}

	public HairShop getHairShop() {
		return this.hairShop;
	}

	public void setHairShop(HairShop hairShop) {
		this.hairShop = hairShop;
	}

	public Hair getHair() {
		return this.hair;
	}

	public void setHair(Hair hair) {
		this.hair = hair;
	}

}

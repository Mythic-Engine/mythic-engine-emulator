/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class ShopItem implements Serializable {

	private Integer id;
	private Shop shop;
	private Item item;
	private int quantityRemain;

	public ShopItem() {
	}

	public ShopItem(Shop shop, Item item, int quantityRemain) {
		this.shop = shop;
		this.item = item;
		this.quantityRemain = quantityRemain;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantityRemain() {
		return this.quantityRemain;
	}

	public void setQuantityRemain(int quantityRemain) {
		this.quantityRemain = quantityRemain;
	}

}

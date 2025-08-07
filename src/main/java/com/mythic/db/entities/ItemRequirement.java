/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class ItemRequirement implements Serializable {

	private ItemRequirementId id;
	private Item itemByItemId;
	private Item itemByReqItemId;
	private int quantity;

	public ItemRequirement() {
	}

	public ItemRequirement(ItemRequirementId id, Item itemByItemId, Item itemByReqItemId, int quantity) {
		this.id = id;
		this.itemByItemId = itemByItemId;
		this.itemByReqItemId = itemByReqItemId;
		this.quantity = quantity;
	}

	public ItemRequirementId getId() {
		return this.id;
	}

	public void setId(ItemRequirementId id) {
		this.id = id;
	}

	public Item getItemByItemId() {
		return this.itemByItemId;
	}

	public void setItemByItemId(Item itemByItemId) {
		this.itemByItemId = itemByItemId;
	}

	public Item getItemByReqItemId() {
		return this.itemByReqItemId;
	}

	public void setItemByReqItemId(Item itemByReqItemId) {
		this.itemByReqItemId = itemByReqItemId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

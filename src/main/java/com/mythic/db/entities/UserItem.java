/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class UserItem implements Serializable {

	private Integer id;
	private Enhancement enhancement;
	private UserEntity userEntity;
	private Item item;
	private boolean equipped;
	private int quantity;
	private boolean bank;
	private Date datePurchased;

	public UserItem() {
	}

	public UserItem(Enhancement enhancement, UserEntity userEntity, Item item, boolean equipped, int quantity, boolean bank) {
		this.enhancement = enhancement;
		this.userEntity = userEntity;
		this.item = item;
		this.equipped = equipped;
		this.quantity = quantity;
		this.bank = bank;
	}

	public UserItem(Enhancement enhancement, UserEntity userEntity, Item item, boolean equipped, int quantity, boolean bank, Date datePurchased) {
		this.enhancement = enhancement;
		this.userEntity = userEntity;
		this.item = item;
		this.equipped = equipped;
		this.quantity = quantity;
		this.bank = bank;
		this.datePurchased = datePurchased;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enhancement getEnhancement() {
		return this.enhancement;
	}

	public void setEnhancement(Enhancement enhancement) {
		this.enhancement = enhancement;
	}

	public UserEntity getUserEntity() {
		return this.userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isEquipped() {
		return this.equipped;
	}

	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isBank() {
		return this.bank;
	}

	public void setBank(boolean bank) {
		this.bank = bank;
	}

	public Date getDatePurchased() {
		return this.datePurchased;
	}

	public void setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
	}

	public JSONObject getJSON() {
		JSONObject itemData = new JSONObject()
			.element("ItemID", this.getItem().getId())
			.element("bCoins", this.getItem().isCoins() ? 1 : 0)
			.element("bHouse", this.getItem().isHouse() ? 1 : 0)
			.element("bPTR", 0)
			.element("bStaff", this.getItem().isStaff() ? 1 : 0)
			.element("bTemp", this.getItem().isTemporary() ? 1 : 0)
			.element("bUpg", this.getItem().isUpgrade() ? 1 : 0)
			.element("iCost", this.getItem().getCost())
			.element("iDPS", this.getItem().getDps())
			.element("iLvl", this.getItem().getLevel())
			.element("iQSindex", this.getItem().getQuestStringIndex())
			.element("iQSvalue", this.getItem().getQuestStringValue())
			.element("iRng", this.getItem().getRange())
			.element("iRty", this.getItem().getRarity())
			.element("iStk", this.getItem().getStack())
			.element("sDesc", this.getItem().getDescription())
			.element("sES", this.getItem().getItemType().getEquipspot().getName())
			.element("sElmt", this.getItem().getElementType().getName())
			.element("sFile", this.getItem().getFile())
			.element("sIcon", this.getItem().getItemType().getIcon())
			.element("sLink", this.getItem().getLink())
			.element("sMeta", this.getItem().getMeta())
			.element("sName", this.getItem().getName())
			.element("sReqQuests", this.getItem().getReqQuests())
			.element("sType", this.getItem().getItemType().getName());
		if (this.getEnhancement().getId() > 0) {
			if (this.getItem().getItemType().getName().equals("Enhancement")) {
				itemData.element("PatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("iDPS", this.getEnhancement().getDps())
					.element("iLvl", this.getEnhancement().getLevel())
					.element("iRty", this.getEnhancement().getRarity())
					.element("EnhID", 0)
					.discard("sFile");
			} else {
				itemData.element("EnhID", this.getEnhancement().getId())
					.element("EnhLvl", this.getEnhancement().getLevel())
					.element("EnhPatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("EnhRty", this.getEnhancement().getRarity())
					.element("iRng", this.getItem().getRange())
					.element("EnhRng", this.getItem().getRange())
					.element("InvEnhPatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("EnhDPS", this.getEnhancement().getDps());
			}
		}

		return itemData;
	}

}

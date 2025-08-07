/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class QuestRewardId implements Serializable {

	private int questId;
	private int itemId;

	public QuestRewardId() {
	}

	public QuestRewardId(int questId, int itemId) {
		this.questId = questId;
		this.itemId = itemId;
	}

	public int getQuestId() {
		return this.questId;
	}

	public void setQuestId(int questId) {
		this.questId = questId;
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
		} else if (!(other instanceof QuestRewardId castOther)) {
			return false;
		} else {
			return this.getQuestId() == castOther.getQuestId() && this.getItemId() == castOther.getItemId();
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getQuestId();
		return 37 * result + this.getItemId();
	}

}

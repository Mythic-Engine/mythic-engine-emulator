package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuestsRewardId implements Serializable {

	private static final long serialVersionUID = -8832644213274159088L;
	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "QuestID", nullable = false)
	private Integer questID;

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getQuestID() {
		return questID;
	}

	public void setQuestID(Integer questID) {
		this.questID = questID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuestsRewardId entity = (QuestsRewardId) o;
		return Objects.equals(this.itemID, entity.itemID) &&
			Objects.equals(this.questID, entity.questID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, questID);
	}

}
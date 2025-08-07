package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersFriendId implements Serializable {

	private static final long serialVersionUID = -3884915785049011939L;
	@Column(name = "FriendID", nullable = false)
	private Integer friendID;

	@Column(name = "UserID", nullable = false)
	private Integer userID;

	public Integer getFriendID() {
		return friendID;
	}

	public void setFriendID(Integer friendID) {
		this.friendID = friendID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UsersFriendId entity = (UsersFriendId) o;
		return Objects.equals(this.friendID, entity.friendID) &&
			Objects.equals(this.userID, entity.userID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(friendID, userID);
	}

}
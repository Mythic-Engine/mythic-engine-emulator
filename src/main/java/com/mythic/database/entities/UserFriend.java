package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users_friends")
public class UserFriend {

	@EmbeddedId
	private UserFriendId id;

	@MapsId("friendID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FriendID", nullable = false)
	private UserEntity friendID;

	@MapsId("userID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private UserEntity userID;

	public UserFriendId getId() {
		return id;
	}

	public void setId(UserFriendId id) {
		this.id = id;
	}

	public UserEntity getFriendID() {
		return friendID;
	}

	public void setFriendID(UserEntity friendID) {
		this.friendID = friendID;
	}

	public UserEntity getUserID() {
		return userID;
	}

	public void setUserID(UserEntity userID) {
		this.userID = userID;
	}

}
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
	private User friendID;

	@MapsId("userID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private User userID;

	public UserFriendId getId() {
		return id;
	}

	public void setId(UserFriendId id) {
		this.id = id;
	}

	public User getFriendID() {
		return friendID;
	}

	public void setFriendID(User friendID) {
		this.friendID = friendID;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

}
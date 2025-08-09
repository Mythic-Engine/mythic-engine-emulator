package com.mythic.database.entities;

import com.mythic.database.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_friends")
public class UserFriend extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FriendID", nullable = false)
	private UserEntity friend;

	public UserEntity getFriend() {
		return friend;
	}

	public UserFriend setFriend(UserEntity friend) {
		this.friend = friend;
		return this;
	}

}
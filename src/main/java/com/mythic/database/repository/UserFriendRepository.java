package com.mythic.database.repository;

import com.mythic.database.entities.UserFriend;
import com.mythic.database.entities.UserFriendId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFriendRepository extends JpaRepository<UserFriend, UserFriendId> {

}
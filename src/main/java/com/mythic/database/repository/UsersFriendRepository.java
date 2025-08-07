package com.mythic.database.repository;

import com.mythic.database.entities.UsersFriend;
import com.mythic.database.entities.UsersFriendId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersFriendRepository extends JpaRepository<UsersFriend, UsersFriendId> {

}
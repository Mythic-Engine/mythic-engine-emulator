package com.mythic.database.repository;

import com.mythic.database.entities.UserItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserItemRepository extends JpaRepository<UserItem, Integer> {

}
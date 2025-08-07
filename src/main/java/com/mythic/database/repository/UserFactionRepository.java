package com.mythic.database.repository;

import com.mythic.database.entities.UserFaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFactionRepository extends JpaRepository<UserFaction, Integer> {

}
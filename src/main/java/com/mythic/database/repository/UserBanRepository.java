package com.mythic.database.repository;

import com.mythic.database.entities.UserBan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBanRepository extends JpaRepository<UserBan, Integer> {

}
package com.mythic.database.repository;

import com.mythic.database.entities.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, Integer> {

}
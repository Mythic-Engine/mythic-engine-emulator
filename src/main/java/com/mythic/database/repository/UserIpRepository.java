package com.mythic.database.repository;

import com.mythic.database.entities.UserIp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserIpRepository extends JpaRepository<UserIp, Integer> {

}
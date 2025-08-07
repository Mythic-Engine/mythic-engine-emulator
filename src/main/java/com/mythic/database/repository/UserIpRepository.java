package com.mythic.database.repository;

import com.mythic.database.entities.UserIp;
import com.mythic.database.entities.UserIpId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserIpRepository extends JpaRepository<UserIp, UserIpId> {

}
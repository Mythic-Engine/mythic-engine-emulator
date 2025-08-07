package com.mythic.database.repository;

import com.mythic.database.entities.UsersIp;
import com.mythic.database.entities.UsersIpId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersIpRepository extends JpaRepository<UsersIp, UsersIpId> {

}
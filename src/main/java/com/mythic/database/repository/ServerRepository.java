package com.mythic.database.repository;

import com.mythic.database.entities.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Integer> {

}
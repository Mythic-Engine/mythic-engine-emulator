package com.mythic.database.repository;

import com.mythic.database.entities.Guild;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuildRepository extends JpaRepository<Guild, Integer> {

}
package com.mythic.database.repository;

import com.mythic.database.entities.MapMonster;
import com.mythic.database.entities.MapMonsterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapMonsterRepository extends JpaRepository<MapMonster, MapMonsterId> {

}
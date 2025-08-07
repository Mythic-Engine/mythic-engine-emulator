package com.mythic.database.repository;

import com.mythic.database.entities.MapsMonster;
import com.mythic.database.entities.MapsMonsterId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapsMonsterRepository extends JpaRepository<MapsMonster, MapsMonsterId> {

}
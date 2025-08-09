package com.mythic.database.repository;

import com.mythic.database.entities.MonsterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<MonsterEntity, Integer> {

}
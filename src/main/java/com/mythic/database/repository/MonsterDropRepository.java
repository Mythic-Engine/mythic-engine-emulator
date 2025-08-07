package com.mythic.database.repository;

import com.mythic.database.entities.MonsterDrop;
import com.mythic.database.entities.MonsterDropId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterDropRepository extends JpaRepository<MonsterDrop, MonsterDropId> {

}
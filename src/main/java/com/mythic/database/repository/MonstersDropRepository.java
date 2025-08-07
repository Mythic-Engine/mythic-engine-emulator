package com.mythic.database.repository;

import com.mythic.database.entities.MonstersDrop;
import com.mythic.database.entities.MonstersDropId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonstersDropRepository extends JpaRepository<MonstersDrop, MonstersDropId> {

}
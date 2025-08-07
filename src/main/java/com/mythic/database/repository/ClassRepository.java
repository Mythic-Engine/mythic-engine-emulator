package com.mythic.database.repository;

import com.mythic.database.entities.GameClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<GameClass, Integer> {

}
package com.mythic.database.repository;

import com.mythic.database.entities.Faction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactionRepository extends JpaRepository<Faction, Integer> {

}
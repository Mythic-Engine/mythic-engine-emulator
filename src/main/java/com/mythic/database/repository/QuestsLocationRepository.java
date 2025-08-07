package com.mythic.database.repository;

import com.mythic.database.entities.QuestsLocation;
import com.mythic.database.entities.QuestsLocationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestsLocationRepository extends JpaRepository<QuestsLocation, QuestsLocationId> {

}
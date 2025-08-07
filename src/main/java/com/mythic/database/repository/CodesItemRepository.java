package com.mythic.database.repository;

import com.mythic.database.entities.CodesItem;
import com.mythic.database.entities.CodesItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodesItemRepository extends JpaRepository<CodesItem, CodesItemId> {

}
package com.mythic.database.repository;

import com.mythic.database.entities.ItemRequirement;
import com.mythic.database.entities.ItemRequirementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRequirementRepository extends JpaRepository<ItemRequirement, ItemRequirementId> {

}
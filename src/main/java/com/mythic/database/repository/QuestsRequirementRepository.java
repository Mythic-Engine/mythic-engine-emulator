package com.mythic.database.repository;

import com.mythic.database.entities.QuestsRequirement;
import com.mythic.database.entities.QuestsRequirementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestsRequirementRepository extends JpaRepository<QuestsRequirement, QuestsRequirementId> {

}
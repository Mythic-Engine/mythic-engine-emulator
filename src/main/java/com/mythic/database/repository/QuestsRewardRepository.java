package com.mythic.database.repository;

import com.mythic.database.entities.QuestsReward;
import com.mythic.database.entities.QuestsRewardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestsRewardRepository extends JpaRepository<QuestsReward, QuestsRewardId> {

}
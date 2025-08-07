package com.mythic.database.repository;

import com.mythic.database.entities.UsersTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTransactionRepository extends JpaRepository<UsersTransaction, Integer> {

}
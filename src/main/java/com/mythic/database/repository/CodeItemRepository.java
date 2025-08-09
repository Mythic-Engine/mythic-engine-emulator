package com.mythic.database.repository;

import com.mythic.database.entities.CodeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeItemRepository extends JpaRepository<CodeItem, Integer> {

}
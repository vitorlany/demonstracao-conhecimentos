package com.example.demo.infrastructure.data.repository;

import com.example.demo.infrastructure.data.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonEntityRepository extends JpaRepository<PersonEntity, Long> {
}

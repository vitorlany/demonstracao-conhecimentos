package com.example.demo.infrastructure.data.repository;

import com.example.demo.infrastructure.data.entity.TextEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextEntityRepository extends JpaRepository<TextEntity, Long> {
}

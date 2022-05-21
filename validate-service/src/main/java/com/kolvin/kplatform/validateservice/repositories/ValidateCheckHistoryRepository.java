package com.kolvin.kplatform.validateservice.repositories;

import com.kolvin.kplatform.validateservice.models.ValidateCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidateCheckHistoryRepository extends JpaRepository<ValidateCheckHistory, Integer> {
}

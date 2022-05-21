package com.kolvin.kplatform.validateservice.services;

import com.kolvin.kplatform.validateservice.models.ValidateCheckHistory;
import com.kolvin.kplatform.validateservice.repositories.ValidateCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ValidateCheckService {

  private final ValidateCheckHistoryRepository validateCheckHistoryRepository;

  public boolean validateApplication(Integer appId) {
    validateCheckHistoryRepository.save(
            ValidateCheckHistory.builder().appId(appId).isValid(true).build()
    );
    return true;
  }
}

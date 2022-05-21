package com.kolvin.kplatform.validateservice.controllers;

import com.kolvin.kplatform.validateservice.services.ValidateCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/validate")
public class ValidateCheckController {

  private final ValidateCheckService validateCheckService;

  @GetMapping(path = "{applicationId}")
  public void validateApplication(@PathVariable("applicationId") Integer applicationId) {
    validateCheckService.validateApplication(applicationId);
  }
}

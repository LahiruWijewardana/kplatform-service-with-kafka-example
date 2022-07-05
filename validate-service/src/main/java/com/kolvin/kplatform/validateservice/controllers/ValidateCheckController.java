package com.kolvin.kplatform.validateservice.controllers;

import com.kolvin.kplatform.clients.validate.ValidateResponse;
import com.kolvin.kplatform.validateservice.services.ValidateCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/validate")
@Slf4j
public class ValidateCheckController {

  private final ValidateCheckService validateCheckService;

  @GetMapping(path = "{applicationId}")
  public ValidateResponse validateApplication(@PathVariable("applicationId") Integer applicationId) {
    log.info("application id " + applicationId + " received for validation");
    boolean isValid = validateCheckService.validateApplication(applicationId);
    return new ValidateResponse(isValid);
  }
}

package com.kolvin.kplatform.validateservice.controllers;

import com.kolvin.kplatform.validateservice.responseformats.ValidateResponse;
import com.kolvin.kplatform.validateservice.services.ValidateCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/validate")
public class ValidateCheckController {

  private final ValidateCheckService validateCheckService;

  @GetMapping(path = "{applicationId}")
  public ValidateResponse validateApplication(@PathVariable("applicationId") Integer applicationId) {
    boolean isValid = validateCheckService.validateApplication(applicationId);
    return new ValidateResponse(isValid);
  }
}

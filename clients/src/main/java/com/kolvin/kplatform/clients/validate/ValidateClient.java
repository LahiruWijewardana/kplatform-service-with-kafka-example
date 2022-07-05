package com.kolvin.kplatform.clients.validate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("validate-service")
public interface ValidateClient {

  @GetMapping(path = "api/v1/validate/{applicationId}")
  ValidateResponse validateApplication(@PathVariable("applicationId") Integer applicationId);
}

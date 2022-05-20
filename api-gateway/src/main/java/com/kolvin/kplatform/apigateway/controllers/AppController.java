package com.kolvin.kplatform.apigateway.controllers;

import com.kolvin.kplatform.apigateway.requestformats.AppRegisterRequest;
import com.kolvin.kplatform.apigateway.services.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/app")
public class AppController {
  private final AppService appService;

  @Autowired
  public AppController(AppService appService) {
    this.appService = appService;
  }

  @PostMapping
  public void registerApp(@RequestBody AppRegisterRequest appRegisterRequest) {
    log.info("New app registration " + appRegisterRequest.toString());
    appService.registerApplication(appRegisterRequest);
  }
}

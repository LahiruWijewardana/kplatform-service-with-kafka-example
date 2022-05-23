package com.kolvin.kplatform.apigateway.services;

import com.kolvin.kplatform.apigateway.models.App;
import com.kolvin.kplatform.apigateway.repositories.AppRepository;
import com.kolvin.kplatform.apigateway.requestformats.AppRegisterRequest;
import com.kolvin.kplatform.apigateway.responses.ValidateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AppService {
  private final AppRepository appRepository;
  private final RestTemplate restTemplate;

  @Autowired
  public AppService(AppRepository appRepository, RestTemplate restTemplate) {
    this.appRepository = appRepository;
    this.restTemplate = restTemplate;
  }

  public void registerApplication(AppRegisterRequest appRegisterRequest) {
    App app = App.builder().
            appName(appRegisterRequest.appName()).
            host_address(appRegisterRequest.host()).
            build();

    appRepository.saveAndFlush(app);

    ValidateResponse validateResponse = restTemplate.getForObject(
            "http://VALIDATE-SERVICE/api/v1/validate/{applicationId}",
            ValidateResponse.class,
            app.getAppId()
    );

    log.info("App validation received " + validateResponse.isValid());

    if (!validateResponse.isValid()) {
      throw new IllegalStateException("App is not valid");
    }
  }
}

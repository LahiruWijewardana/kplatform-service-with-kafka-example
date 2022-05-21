package com.kolvin.kplatform.apigateway.services;

import com.kolvin.kplatform.apigateway.models.App;
import com.kolvin.kplatform.apigateway.repositories.AppRepository;
import com.kolvin.kplatform.apigateway.requestformats.AppRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
  private final AppRepository appRepository;

  @Autowired
  public AppService(AppRepository appRepository) {
    this.appRepository = appRepository;
  }

  public void registerApplication(AppRegisterRequest appRegisterRequest) {
    App app = App.builder().appId(1).
            appName(appRegisterRequest.appName()).
            host_address(appRegisterRequest.host()).
            build();

    appRepository.save(app);
  }
}

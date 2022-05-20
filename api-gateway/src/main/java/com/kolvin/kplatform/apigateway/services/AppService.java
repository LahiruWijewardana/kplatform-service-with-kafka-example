package com.kolvin.kplatform.apigateway.services;

import com.kolvin.kplatform.apigateway.models.App;
import com.kolvin.kplatform.apigateway.requestformats.AppRegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class AppService {
  public void registerApplication(AppRegisterRequest appRegisterRequest) {
    App app = App.builder().
            appId(1).appName(appRegisterRequest.appName()).
            host(appRegisterRequest.host()).
            build();
  }
}

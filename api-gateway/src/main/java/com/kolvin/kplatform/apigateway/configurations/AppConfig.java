package com.kolvin.kplatform.apigateway.configurations;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  @Bean("validationService")
  @LoadBalanced
  public RestTemplate validationRestTemplate() {
    return new RestTemplate();
  }

  @Bean("notificationService")
  @LoadBalanced
  public RestTemplate notificationRestTemplate() {
    return new RestTemplate();
  }
}

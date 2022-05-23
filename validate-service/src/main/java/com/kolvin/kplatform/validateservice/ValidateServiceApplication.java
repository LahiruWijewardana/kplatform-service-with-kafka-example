package com.kolvin.kplatform.validateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ValidateServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ValidateServiceApplication.class, args);
  }
}

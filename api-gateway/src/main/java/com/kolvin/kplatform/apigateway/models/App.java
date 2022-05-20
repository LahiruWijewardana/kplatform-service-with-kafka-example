package com.kolvin.kplatform.apigateway.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class App {
  private Integer appId;
  private String appName;
  private String host;
}

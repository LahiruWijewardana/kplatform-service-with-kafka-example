package com.kolvin.kplatform.apigateway.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "app"
)
public class App {

  @Id
  @Column(
          name = "app_id",
          updatable = false
  )
  private Integer appId;
  @Column(
          name = "app_name",
          nullable = false
  )
  private String appName;
  @Column(
          name = "host_address",
          nullable = false
  )
  private String host_address;
}

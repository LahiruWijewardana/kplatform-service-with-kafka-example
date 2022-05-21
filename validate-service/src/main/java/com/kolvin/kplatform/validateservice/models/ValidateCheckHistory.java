package com.kolvin.kplatform.validateservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "validate_check_history"
)
public class ValidateCheckHistory {

  @Id
  @Column(
          name = "id"
  )
  @GeneratedValue(
          strategy = GenerationType.IDENTITY
  )
  private Integer id;

  @Column(
          name = "app_id",
          nullable = false
  )
  private Integer appId;

  @Column(
          name = "is_valid",
          nullable = false
  )
  private boolean isValid;
}

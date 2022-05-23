package com.kolvin.kplatform.notificationservice.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "notification"
)
public class Notification {

  @Id
  @Column(
          name = "id"
  )
  @GeneratedValue(
          strategy = GenerationType.IDENTITY
  )
  private int id;

  @Column(
          name = "app_id",
          nullable = false
  )
  private int appId;

  @Column(
          name = "message",
          nullable = false
  )
  private String message;

  @Column(
          name = "sent_timestamp",
          nullable = false
  )
  private LocalDateTime sentTimestamp;
}

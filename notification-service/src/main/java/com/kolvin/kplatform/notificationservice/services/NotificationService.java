package com.kolvin.kplatform.notificationservice.services;

import com.kolvin.kplatform.notificationservice.requestformats.SendNotificationRequest;
import com.kolvin.kplatform.notificationservice.models.Notification;
import com.kolvin.kplatform.notificationservice.repositories.NotificationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
@Slf4j
public class NotificationService {
  private final NotificationRepository notificationRepository;

  public boolean addNotification(SendNotificationRequest sendNotificationRequest) {
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    notificationRepository.save(
            Notification.builder().
                    appId(sendNotificationRequest.appId()).
                    message(sendNotificationRequest.message()).
                    sentTimestamp(LocalDateTime.now()).build()
    );

    return true;
  }
}

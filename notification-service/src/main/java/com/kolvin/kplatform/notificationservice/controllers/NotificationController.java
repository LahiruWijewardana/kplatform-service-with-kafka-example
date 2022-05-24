package com.kolvin.kplatform.notificationservice.controllers;

import com.kolvin.kplatform.notificationservice.reponseformats.NotificationResponse;
import com.kolvin.kplatform.notificationservice.requestformats.SendNotificationRequest;
import com.kolvin.kplatform.notificationservice.services.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/notification")
public class NotificationController {

  private final NotificationService notificationService;

  @PostMapping
  public NotificationResponse sendNotification(@RequestBody SendNotificationRequest sendNotificationRequest) {
    boolean notificationStatus = notificationService.addNotification(sendNotificationRequest);

    if (notificationStatus) {
      return new NotificationResponse(true, "Notification added");
    }

    return new NotificationResponse(false, "Notification failed");
  }
}

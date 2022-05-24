package com.kolvin.kplatform.notificationservice.queue;

import com.kolvin.kplatform.notificationservice.reponseformats.NotificationResponse;
import com.kolvin.kplatform.notificationservice.requestformats.SendNotificationFormat;
import com.kolvin.kplatform.notificationservice.services.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class QueueConsumer {

  private final NotificationService notificationService;

  @RabbitListener(queues = {"${queue.name}"})
  public NotificationResponse receiveNotification(SendNotificationFormat sendNotificationFormat) {
    log.info("Message received to consumer...................");
    log.info(sendNotificationFormat.toString());
//    boolean notificationStatus = notificationService.addNotification(sendNotificationFormat);
//    boolean notificationStatus = true;
//    if (notificationStatus) {
//      return new NotificationResponse(true, "Notification added");
//    }

    return new NotificationResponse(false, "Notification failed");
  }
}

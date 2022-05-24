package com.kolvin.kplatform.notificationservice.queue;

import com.kolvin.kplatform.notificationservice.reponseformats.NotificationResponse;
import com.kolvin.kplatform.notificationservice.requestformats.SendNotificationRequest;
import com.kolvin.kplatform.notificationservice.services.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class QueueConsumer {

  private final NotificationService notificationService;

  @RabbitListener(queues = "${queue.name}")
  public void receiveNotification(SendNotificationRequest sendNotificationRequest) {
    log.info("Message received to consumer...................");

   notificationService.addNotification(sendNotificationRequest);
  }

}

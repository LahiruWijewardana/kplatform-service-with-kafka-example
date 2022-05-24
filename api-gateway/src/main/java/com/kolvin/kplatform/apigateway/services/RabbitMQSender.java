package com.kolvin.kplatform.apigateway.services;

import com.kolvin.kplatform.apigateway.requestformats.SendNotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQSender {

  private final AmqpTemplate rabbitTemplate;

  @Value("${queue.exchange}")
  private String exchange;

  @Value("${queue.routingKey}")
  private String routingKey;

  @Autowired
  public RabbitMQSender(AmqpTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public void sendToQueue(SendNotificationRequest sendNotificationRequest) {
    rabbitTemplate.convertAndSend(exchange, routingKey, sendNotificationRequest);
    log.info("Message Send to Queue " + sendNotificationRequest.toString());
  }
}

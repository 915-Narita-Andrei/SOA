package com.toie.shopApp.service;

import com.toie.shopApp.domain.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.toie.shopApp.configuration.rabbitmq.RabbitMqConfig.EMAIL_QUEUE;

@Service
@RequiredArgsConstructor
public class EmailPublisher {
    private final RabbitTemplate rabbitTemplate;

    public void publishEmail(EmailRequest emailRequest) {
        rabbitTemplate.convertAndSend(EMAIL_QUEUE, emailRequest);
    }
}

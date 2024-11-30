package com.toie.shopApp.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnalyticsPubliser {
    private static final String TOPIC = "analytics";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publishAnalytocs(String message) {

        kafkaTemplate.send(TOPIC, message);
    }
}

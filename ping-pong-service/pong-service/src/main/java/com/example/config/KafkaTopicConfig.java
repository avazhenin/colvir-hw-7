package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class KafkaTopicConfig {
    @Value("${outgoing.topic}")
    private String outGoingTopic;
    @Bean
    public NewTopic pingTopic() {
        return new NewTopic(outGoingTopic, 1, (short) 1);
    }
}

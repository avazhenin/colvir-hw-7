package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RecieveMessages {
    Logger logger = LoggerFactory.getLogger(RecieveMessages.class);

    @KafkaListener(topics = "#{'${incoming.topic}'}")
    public void processMessage(String content) {
        logger.info("recieved message: {}", content);
    }
}

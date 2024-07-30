package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class RecieveMessages {
    Logger logger = LoggerFactory.getLogger(RecieveMessages.class);

    @Autowired
    private KafkaTemplate<Object, Object> template;
    @Value("${outgoing.topic}")
    private String outGoingTopic;

    @KafkaListener(topics = "#{'${incoming.topic}'}")
    public void processMessage(String content) {
        logger.info(String.format("recieved message: %s", content));
        logger.info("sending pong");
        template.send(outGoingTopic, "pong");
    }
}

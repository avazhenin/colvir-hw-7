package com.example.controller;

import com.example.consumer.RecieveMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Logger logger = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private KafkaTemplate<Object, Object> template;
    @Value("${outgoing.topic}")
    private String outGoingTopic;

    @PostMapping(path = "/ping")
    public void ping() {
        logger.info("sending ping");
        this.template.send(outGoingTopic, "ping");
    }
}

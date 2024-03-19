package com.example.controller;

import com.example.config.KafkaConstraints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/producer/{message}")
    public String producer(@PathVariable String message) {
        kafkaTemplate.send(KafkaConstraints.TOPIC_NAME, message);
        return message;
    }

}

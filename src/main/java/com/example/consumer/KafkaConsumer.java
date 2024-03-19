package com.example.consumer;

import com.example.config.KafkaConstraints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = KafkaConstraints.TOPIC_NAME, groupId = KafkaConstraints.GROUP_ID_CONFIG, containerFactory = KafkaConstraints.KAFKA_LISTENER_CONTAINER_FACTORY)
    public void consumer(String message) {
        log.info("Mensagem: {}.", message);
    }

}

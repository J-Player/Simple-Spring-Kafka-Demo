package com.example.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class KafkaConstraints {

    public static final String TOPIC_NAME = "topic-name";
    public static final String GROUP_ID_CONFIG = "group-id";
    public static final String KAFKA_LOCAL_SERVER_CONFIG = "localhost:9092";
    public static final String KAFKA_LISTENER_CONTAINER_FACTORY = "kafkaListenerContainerFactory";

}

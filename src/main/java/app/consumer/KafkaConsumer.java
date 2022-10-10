package app.consumer;

import app.constant.ApplicationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = ApplicationConstant.TOPIC_NAME, groupId = ApplicationConstant.GROUP_ID_STRING, containerFactory = ApplicationConstant.KAFKA_LISTENER_CONTAINER_FACTORY)
    public void consumer(String message) {
        log.info("Mensagem: {}.", message);
    }

}

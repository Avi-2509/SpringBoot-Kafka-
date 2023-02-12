package com.testGuide.springkafka.kafka;

import com.testGuide.springkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class JsonKafkaProducer {

    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;
    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(User data){
        log.info("message {}", data);
        Message message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "JsonKafkaTopic")
                .build();
        kafkaTemplate.send(message);
    }

}

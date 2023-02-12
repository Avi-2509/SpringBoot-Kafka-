package com.testGuide.springkafka.kafka;

import com.testGuide.springkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "JsonKafkaTopic", groupId = "myGroup")
    public void consume(User data){
        log.info("----Message----{}", data);
    }
}

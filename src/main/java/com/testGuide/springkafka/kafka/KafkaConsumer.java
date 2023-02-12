package com.testGuide.springkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test1", groupId = "myGroup")
    public void consume(String msg){
        log.info("----Message----{}", msg);
    }
}

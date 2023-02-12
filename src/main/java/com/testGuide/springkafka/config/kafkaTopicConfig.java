package com.testGuide.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic kafkaTestTopic(){

        return TopicBuilder.name("test1")
                .build();
    }

    @Bean
    public NewTopic JsonKafkaNewTopic(){

        return TopicBuilder.name("JsonKafkaTopic")
                .build();
    }
}

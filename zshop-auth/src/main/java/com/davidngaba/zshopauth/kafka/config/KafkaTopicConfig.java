package com.davidngaba.zshopauth.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {
     @Bean
     public KafkaAdmin.NewTopics topics() {
         return new KafkaAdmin.NewTopics(
                 TopicBuilder.name("zshop-auth-requests")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-auth-replies")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-auth")
                         .partitions(1)
                         .build()
         );
     }
}

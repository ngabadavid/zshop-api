package com.davidngaba.zshopuser.kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {
     @Bean
     public KafkaAdmin.NewTopics topics456() {
         return new KafkaAdmin.NewTopics(
                 TopicBuilder.name("zshop-user-requests")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-user-replies")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-user")
                         .partitions(1)
                         .build()
         );
     }
}

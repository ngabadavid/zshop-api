package com.davidngaba.zshopgateway.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;

@Configuration
public class KafkaTopicConfig {
     @Bean
     public KafkaAdmin.NewTopics topics() {
         return new KafkaAdmin.NewTopics(
                 TopicBuilder.name("zshop-gateway-requests")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-gateway-replies")
                         .partitions(1)
                         .build(),
                 TopicBuilder.name("zshop-gateway")
                         .partitions(1)
                         .build()
         );
     }
}

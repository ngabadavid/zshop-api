package com.davidngaba.zshopgateway.service;

import com.davidngaba.zshopgateway.models.ZshopUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZshopGatewayService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public ZshopUser findUserByEmail(String username){
        kafkaTemplate.send("zshopuser", username);
        return null;
    }
}

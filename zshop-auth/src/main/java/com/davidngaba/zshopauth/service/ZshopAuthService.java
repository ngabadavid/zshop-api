package com.davidngaba.zshopauth.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZshopAuthService {
    @KafkaListener(id = "so53151961", topics = "zshop-auth-requests")
    @SendTo
    public String handle(String foo) {
        System.out.println(foo);
        return foo.toUpperCase();
    }
//    @KafkaListener(topics = "zshop-auth-requests",groupId ="zshop-auth-groupid")
//    @SendTo
//    public String authenticate(String in) {
//        System.out.println("Auth Server received: " + in);
//        return in.toUpperCase();
//    }
    /*private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public ZshopUser findUserByEmail(String username){
        kafkaTemplate.send("zshopuser", username);
        return null;
    }*/
}

package com.davidngaba.zshopuser.services;

import com.davidngaba.zshopuser.entities.ZshopUser;
import com.davidngaba.zshopuser.repositories.ZshopUserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ZshopUserService {
   /* private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ZshopUserRepository zshopUserRepository;

    public void findbyEmail(String userName){
        Optional<ZshopUser> optionalZshopUser = this.zshopUserRepository.findByEmail(userName);
        if(optionalZshopUser.isEmpty()){
            throw new RuntimeException();
        }
        try{
            kafkaTemplate.send("zshopgateway",objectMapper.writeValueAsString(optionalZshopUser.get()));
        }catch(JsonProcessingException jsonProcessingException){
            kafkaTemplate.send("zshopgateway","jsonProcessingException");
        }
    }*/
}
package com.davidngaba.zshopgateway.controllers;

import com.davidngaba.zshopgateway.models.ZshopUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/v1")
@AllArgsConstructor
public class ZshopGatewayController {
    //private final RegistrationService registrationService;
    private final KafkaTemplate<String, String> kafkaTemplate;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/users")
    public List<ZshopUser> getUsers(){
        ZshopUser u1 = new ZshopUser(1L,"David","david@zshop.com");
        ZshopUser u2 = new ZshopUser(2L,"Salem","salem@zshop.com");

        List l = new ArrayList<ZshopUser>();
        l.add(u1);
        l.add(u2);
        return l;
    }

    @PostMapping
    public ZshopUser createUser(@RequestBody ZshopUser zshopUser){
        /*zshopUser.setFirstName("test");
        return zshopUser;*/
        try {
            kafkaTemplate.send("zshopuser", objectMapper.writeValueAsString(zshopUser));
            return zshopUser;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

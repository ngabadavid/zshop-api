package com.davidngaba.zshopuser.helpers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics="zshopuser",
            groupId = "zshopuserGroupId"
    )
    void listener(String data){
        System.out.println("Listener received: " + data);
    }
}

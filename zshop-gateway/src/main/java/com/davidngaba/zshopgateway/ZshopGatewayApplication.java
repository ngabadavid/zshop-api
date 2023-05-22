package com.davidngaba.zshopgateway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ZshopGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZshopGatewayApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("zshopuser","get-users");
		};
	}*/
}

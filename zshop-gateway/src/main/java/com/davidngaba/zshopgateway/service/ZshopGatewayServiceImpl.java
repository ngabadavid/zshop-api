package com.davidngaba.zshopgateway.service;

import com.davidngaba.zshopgateway.models.AuthenticationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.requestreply.RequestReplyFuture;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
@RequiredArgsConstructor
public class ZshopGatewayServiceImpl implements ZshopGatewayService {

    //private final KafkaTemplate kafkaTemplate;
    private final ReplyingKafkaTemplate<String, String, String> replyingKafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String authenticate(AuthenticationRequest authenticationRequest) {
        ProducerRecord<String, String> record = new ProducerRecord<>("zshop-auth-requests","authenticate", "authenticate");
        //record.headers().add(new RecordHeader(KafkaHeaders.REPLY_TOPIC, "zshop-gateway-replies".getBytes()));
        RequestReplyFuture<String, String, String> replyFuture = replyingKafkaTemplate.sendAndReceive(record);
        String test = "init";
        try {
            //System.out.println("response" + replyFuture.get(10, TimeUnit.SECONDS).value());
            test = replyFuture.get(10, TimeUnit.SECONDS).value();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
//        try {
//            SendResult<String, String> sendResult = replyFuture.getSendFuture().get(5, TimeUnit.SECONDS);
//            System.out.println("gateway service Sent ok: " + sendResult.getRecordMetadata());
//
//            ConsumerRecord<String, String> consumerRecord = replyFuture.get(5, TimeUnit.SECONDS);
//            System.out.println("gateway service Return value: " + consumerRecord.value());
//            return consumerRecord.value();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (TimeoutException e) {
//            throw new RuntimeException(e);
//        }
        return test;
    }
}

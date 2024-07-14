package com.ajay.kafka.services;

import com.ajay.kafka.model.Person;
import com.ajay.kafka.utils.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonListenerGroup1 {
    @KafkaListener(topics = AppConstants.TOPIC_NAME, containerFactory = "kafkaPersonListenerContainerFactory")
    public void listenGroupFoo(Person message) {
        log.info(String.format("Message received -> %s", message.toString()));
    }
}

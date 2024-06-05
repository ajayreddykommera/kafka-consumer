package com.ajay.kafkaConsumer.services;

import com.ajay.kafkaConsumer.model.Person;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class listenGroup1 {
    @KafkaListener(
            topics = "test2",
            containerFactory = "kafkaPersonListenerContainerFactory")
    public void listenGroupFoo(Person message) {
        System.out.println("Received Message in group 2: " + message);
    }
}

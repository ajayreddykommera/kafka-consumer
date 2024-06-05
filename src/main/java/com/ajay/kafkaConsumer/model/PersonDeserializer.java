package com.ajay.kafkaConsumer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class PersonDeserializer implements Deserializer<Person> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // No additional configuration needed
    }

    @Override
    public Person deserialize(String topic, byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, Person.class);
        } catch (IOException e) {
            // Handle deserialization exception
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void close() {
        // No resources to close
    }
}


package com.tc.poc.policy.event.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.tc.poc.policy.event.model.Policy;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "posting";
    
    /*
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    */
    
    @Autowired
    private KafkaTemplate<String, Policy> kafkaTemplatePolicy;

    /*
    public void sendMessage(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
    
    */
    public void sendPolicy(Policy policy) {
        logger.info(String.format("#### -> Producing message -> %s", policy));
        this.kafkaTemplatePolicy.send(TOPIC, policy);
    }
}

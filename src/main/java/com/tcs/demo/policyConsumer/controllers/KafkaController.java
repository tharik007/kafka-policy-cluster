package com.tcs.demo.policyConsumer.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.demo.policyConsumer.engine.Producer;
import com.tcs.demo.policyConsumer.model.Policy;

import org.springframework.boot.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }
    /*
    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
    */
    
    @PostMapping(value = "/policy")
    public void sendPolicyToKafkaTopic(@RequestBody Policy policy) {
        this.producer.sendPolicy(policy);
    }
}
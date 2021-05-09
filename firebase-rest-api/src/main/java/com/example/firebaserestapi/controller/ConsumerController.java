package com.example.firebaserestapi.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firebaserestapi.datamodel.Consumer;
import com.example.firebaserestapi.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;
	
	@PostMapping("/createConsumer")
    public String createPatient(@RequestBody Consumer consumer ) throws InterruptedException, ExecutionException {
        return consumerService.saveConsumerDetails(consumer);
    }
	
} // end of class

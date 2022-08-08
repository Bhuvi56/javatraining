package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.direct.config.DirectExchangeConfig;


@RestController
public class StudentController {
	


	@Autowired
	private RabbitTemplate template;
	
	
	@GetMapping(path = "/students/{studentName}")
	public String sendMessage() {
		
		template.convertAndSend(DirectExchangeConfig.EXCHANGE,
				DirectExchangeConfig.ROUTING_KEY,"Best student bhuvi");
		
		return "one message send"; 
	}
	

}

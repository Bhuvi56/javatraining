package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.services.PassengerService;

@RestController
@RequestMapping(path = "/api/v1")
public class PassengerController {
	
	@Autowired
	private PassengerService service;
	
	@GetMapping(path = "/passengers")
public List<Passenger> getAllPassenger(){
	
	 return this.service.findAll();
}
	
//	@GetMapping(path = "/passengers/{passengerName}")
//	public List<Passenger> getByPassengerName(@PathVariable("passengerName") String name) {
//		return this.service.findByPassengerName(name);
//	}
//	
	@GetMapping(path = "/passengers/srch/date/{tripTripDateTime}")
	public List<Passenger> findByTripHistoryTripDateTime(@PathVariable("tripTripDateTime")
	@DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime dateAndTime){
		return this.service.findByTripDateTime(dateAndTime);
		
	}
 

}

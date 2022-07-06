package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.repos.PassengerRepository;

@Service
public class PassengerService {
		@Autowired
		PassengerRepository repo;
		
		
		
		

//		public List<Passenger> findByPassengerName(String name) {
//		return this.repo.findByPassengerName(name);
//		}
//	
	
	public List<Passenger> findByTripDateTime(LocalDateTime date){
	return this.repo.findByTripHistoryListTripDateTime(date);
	}

public Passenger add(Passenger entity) {
	return this.repo.save(entity);
}
	

	public List<Passenger> findAll() {
	
		return  this.repo.findAll();
	}



}
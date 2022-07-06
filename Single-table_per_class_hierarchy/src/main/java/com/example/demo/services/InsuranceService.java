package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {
	
	
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	
	HealthInsurance entity;
	
	
	@Autowired
	
	LifeInsurance lifeInsurance;
	
	
	public void addHealthPolicy() {
		
		Object obj=repo.save(entity);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
	
	public void getHealthPolicy() {
		repo.findAllHealth().forEach(System.out::println);
	}

	
	
public void addLifePolicy() {
		
		Object obj=repo.save(lifeInsurance);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
	
	public void getLifePolicy() {
		repo.findAllLife().forEach(System.out::println);
	}
	
	
	
	
	
	

}

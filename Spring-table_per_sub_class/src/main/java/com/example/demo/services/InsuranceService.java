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
	
	LifeInsurance lifeinsurance;
	
	
	public void addHealthPolicy() {
		
		Object obj=repo.save(entity);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
//	
//	public void getHealthPolicy() {
//		repo.findAll().forEach(System.out::println);
//	}

	
	
public void addLifePolicy() {
		
		Object obj=repo.save(lifeinsurance);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
	
	public void getLifePolicy() {
		repo.findAll().forEach(System.out::println);
	}
	
	
	
	public void getHealthPolicy() {
		repo.findHealthProducts().forEach(System.out::println);
	}
	
	
	
	
	public void getAllPolicy() {
		repo.findHealthProducts().forEach(System.out::println);
	}
}

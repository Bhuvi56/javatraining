package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;

import com.example.demo.entity.Patient;
import com.example.demo.repos.PatientRepository;



@Service
public class PatientService {
	
	private PatientRepository repo;

	@Autowired
	public PatientService(PatientRepository repo) {
		super();
		this.repo = repo;
	}
	
	public  Patient save( Patient entity) {
		return repo.save(entity);
		
	}
	public List< Patient>findAll(){
		return repo.findAll();
	}
	
	  public List<Donor> srchByLocation(String location){
		   return this.repo.searchByLocation(location);
	   }
	  
	  public List<Donor> srchByBloodGroup(String bloodGroup){
		   return this.repo.searchByBloodGroup(bloodGroup);
	   }


	  
	
}

package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService {
	
	
	 private  DriverRepository repo ;

	 @Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
	
		return this.repo.findAll();

	}

	public Driver add(Driver entity) {
	
		return this.repo.save(entity);
	}
	
	
	   public  Driver  findById(int id) {
		   
		          return this.repo.findById(id).orElseThrow(() -> new 
		                      RuntimeException("Driver not found"));
		   }

	   public Driver remove(Driver entity) {
			boolean result=this.repo.existsById(entity.getDriverId());
			if(result) {
			this.repo.delete(entity);
			}else {
				throw new NoSuchElementException("element with Id ="+entity.getDriverId()+"Not Present");
			}
			return entity;
			}

	   
	   public List<Driver> findByDriverName(String srchName){
		   
		   return this.repo.findByDriverName(srchName);
	   }
	   
	   public List<Driver> findByMobileNumber(long number){
		   return this.repo.findByMobileNumber(number);
	   }
	   
	   
	   public List<Driver> srchByrating(double rating){
		   return this.repo.searchByRating(rating);
	   }
	   
	   public int updateRating(int id,double updateRating){
		   return this.repo.modifyRating(id, updateRating);

	   
	   }
	   
	   
	   
	   
	   public List<Driver> sortedList(String propName){
		   return this.repo.findAll(Sort.by(propName));
	   }
}
		   


	

	

	    



package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Donor;

import com.example.demo.repos.DonorRepository;

@Service
public class DonorService {
	
	private DonorRepository repo;

	@Autowired
	public DonorService(DonorRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public Donor save(Donor entity) {
		return repo.save(entity);
		
	}
	public List<Donor>findAll(){
		return repo.findAll();
	}
	
	public void  remove(int id){
		this.repo.deleteById(id);
	}

	  public int updateLocation(int id,String updateLocation){
		   return this.repo.modifyLocation(id, updateLocation);

	   
	   }


}

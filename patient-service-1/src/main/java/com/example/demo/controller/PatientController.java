package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;


@RestController
@RequestMapping(path = "/api/v1/patients")
@CrossOrigin(origins="*")
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	
	@PostMapping
	public Patient add(@RequestBody Patient entity) {
		
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<Patient>findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/location/{location}")
	public Patient[] getByLocation(@PathVariable("location")String location){

	 return this.service. srchByLocation(location);
	}
	
	
	@GetMapping(path = "/srch/bloodgroup/{bloodGroup}")
	public Patient[] getByBloodGroup(@PathVariable("bloodGroup")String bloodGroup){

	 return this.service. srchByBloodGroup(bloodGroup);
	}
	

	

}

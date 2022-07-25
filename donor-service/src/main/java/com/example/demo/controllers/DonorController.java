package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Donor;
import com.example.demo.service.DonorService;

@RestController
@RequestMapping(path = "/api/v1/donors")
@CrossOrigin(origins="*")
public class DonorController {
	
	@Autowired
	private DonorService service;
	
	
	@PostMapping
	public Donor add(@RequestBody Donor entity) {
		
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<Donor>findAll(){
		
		return this.service.findAll();
	}
	
	 @DeleteMapping(path = "/{id}")
		public ResponseEntity<String> remove(@PathVariable("id")  int id){
			
			this.service.remove(id);
			
			return ResponseEntity.status(HttpStatus.OK).body("one row deleted");
			
		}

@PutMapping(path="/update/{id}/{location}")
 public ResponseEntity<Object>updateLocation (@PathVariable("id")int id,@PathVariable("location")String updateLocation){
	
	int rowUpdated=this.service.updateLocation(id, updateLocation);
	if(rowUpdated!=0) {
		return ResponseEntity.status(200).body(rowUpdated+ " updated")
				;
	}else {

		return ResponseEntity.ok("not updated");

	}
}
	
}

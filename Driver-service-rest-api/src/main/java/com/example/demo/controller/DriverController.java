    package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;




@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {
	
	
	@Autowired
	 private  DriverService service ;

	public DriverController(DriverService service) {
		super();
		this.service = service;
	}

	
	@GetMapping(path = "/drivers")
public List<Driver> getAllDrivers(){
	
	 return this.service.findAll();
}
@GetMapping(path = "/drivers/{id}")
	
	public Driver getDriverById(@PathVariable("id") int id) {
		
		return this.service.findById(id);
	}

//	
@PostMapping(path = "/drivers/add")
	
	public Driver addDriver(@RequestBody Driver entity) {
		
		return this.service.add(entity);
	}
	
		@PostMapping(path = "/drivers/add1")	
			public ResponseEntity<Driver> addDriver1(@RequestBody Driver entity) {
	
			Driver driver=this.service.add(entity);

		return ResponseEntity.status(HttpStatus.CREATED).body(driver);

} 
		
//		
		@PostMapping("/drivers")
		public ResponseEntity<Driver> addDriver2(@RequestBody Driver entity){

			Driver driver=this.service.add(entity);
		
		URI location=
		           ServletUriComponentsBuilder
	          .fromCurrentRequest()
	         .path("/{id}")
		          .buildAndExpand(entity.getDriverId())
		          .toUri();  
		return ResponseEntity.created(location).body(entity);  
		}

@DeleteMapping(path = "/drivers")

public ResponseEntity<Object> remove(@RequestBody Driver entity) {

Driver result = this.service.remove(entity);
if(result!=null) {
	return ResponseEntity.status(204).build();
}else {

	return ResponseEntity.ok("No record matching");

}
}	


@GetMapping(path = "/drivers/srch/phone/{mobileNumber}")
public List<Driver> getByMobileNumber(@PathVariable("mobileNumber")long number){

 return this.service.findByMobileNumber(number);
}

@GetMapping(path = "/drivers/srch/name/{driverName}")
public List<Driver> getByDriverName(@PathVariable("driverName")String srchName){

 return this.service.findByDriverName(srchName);
}

@GetMapping(path = "/drivers/srch/rating/{rating}")
public List<Driver> getByRating(@PathVariable("rating")double rating){

 return this.service. srchByrating(rating);
}

@PutMapping(path="/drivers/{id}/{rating}")
 public ResponseEntity<Object>updateRating (@PathVariable("id")int id,@PathVariable("rating")double updateRating){
	
	int rowUpdated=this.service.updateRating(id, updateRating);
	if(rowUpdated!=0) {
		return ResponseEntity.status(200).body(rowUpdated+ " updated")
				;
	}else {

		return ResponseEntity.ok("not updated");

	}
}	
	@GetMapping(path="/drivers/sort/{propName}")

	public List<Driver> sortBy(@PathVariable("propName") String propName){
		return this.service.sortedList(propName);
	}
}






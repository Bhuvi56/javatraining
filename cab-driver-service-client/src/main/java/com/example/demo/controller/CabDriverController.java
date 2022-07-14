package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;


@RestController
@RequestMapping(path = "/client")
public class CabDriverController {

        @Autowired
		private RestTemplate template;
		@Autowired
		private TripDTO dto;
		
	
    @GetMapping(path = "/drivers")
	public String getDrivers() {
		
		return template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
		}
    
    @GetMapping(path = "/trips")
   	public TripDetail getTrips() {
   		
   		return this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips",TripDetail.class);
   		}

//    @GetMapping(path = "/drivers/json")
//   	public CabDriver getDriversAsJson() {
//   		
//   		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver.class);
//   		}
		
	
    @GetMapping(path = "/srch/drivers/{name}")
	public String getDriverByName(@PathVariable("name")String name) {
		
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);
		}
  
    @GetMapping(path = "/driver/trips/{id}")
 	public String getDriverTrips(@PathVariable("id")int id) {
 		
 		String driver= this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,String.class);
 		
 		String trips= this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/srch/driver/"+id,String.class);
 		
 		return driver+trips;
 		}
//  @GetMapping(path = "/drivers/json")
// 	public String getDriversAsJson() {
// 		
// 		return this.template.getForObject("http://CAB-DRIVER-SERVICE-CLIENT/api/v1/drivers",String.class);
// 		}
//		
    @GetMapping(path = "/driver/trips/json/{id}")
	public TripDTO getDriverTrip(@PathVariable("id")int id) {
		
		CabDriver driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
				
		TripDetail[] trips=this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/srch/driver/"+id,TripDetail[].class);	
		Set<TripDetail> set= Arrays.stream(trips).collect(Collectors.toSet());
		dto.setDriver(driver);
		
		dto.setTrips(set);
		
		return dto;
	
	}
	
    
	}



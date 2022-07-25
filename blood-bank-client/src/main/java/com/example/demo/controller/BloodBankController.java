package com.example.demo.controller;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.DonorDTO;
import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.Patient;
import com.example.demo.entity.TripDetail;



@RestController
@RequestMapping(path = "/client")
public class BloodBankController {
	
	   @Autowired
			private RestTemplate template;
	   
		@Autowired
		private DonorDTO dto;
		
		
	    @GetMapping(path = "/patients/donors/srch/location/{location}")
		public DonorDTO getDriverTrip(@PathVariable("location")String location) {
			
			Patient patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/"+location,Patient.class);
					
			TripDetail[] trips=this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/srch/driver/"+id,TripDetail[].class);	
			Set<TripDetail> set= Arrays.stream(trips).collect(Collectors.toSet());
			dto.setDriver(driver);
			
			dto.setTrips(set);
			
			return dto;
		
		}
		

}

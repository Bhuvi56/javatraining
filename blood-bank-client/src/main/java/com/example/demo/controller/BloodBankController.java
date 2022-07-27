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

import com.example.demo.dto.DonorDTO;

import com.example.demo.entity.Donor;
import com.example.demo.entity.Patient;




@RestController
@RequestMapping(path = "/client")
public class BloodBankController {
	
	   @Autowired
			private RestTemplate template;
	   
		@Autowired
		private DonorDTO dto;
		
		
	    @GetMapping(path = "/patients/donors/srch/location/{location}")
		public DonorDTO getPatientDonor(@PathVariable("location")String location) {
			
			Patient[] patient1=this.template.getForObject
					("http://PATIENT-SERVICE/api/v1/patients/srch/location/"+location,Patient[].class);
					
			Donor[] donors1=this.template.getForObject("http://DONOR-SERVICE/api/v1/donors/srch/location/"+location,Donor[].class);	
			Set<Donor> donors= Arrays.stream(donors1).collect(Collectors.toSet());
			Set<Patient> patient= Arrays.stream(patient1).collect(Collectors.toSet());
			dto.setPatient(patient);
			
		dto.setDonors(donors);
		dto.setPatient(patient);
			
			return dto;
		
		}
	    
	    @GetMapping(path = "/patients/donors/srch/bloodgroup/{bloodGroup}")
		public DonorDTO getPatientDonorBlood(@PathVariable("bloodGroup")String location) {
			
			Patient[] patient1=this.template.getForObject
					("http://PATIENT-SERVICE/api/v1/patients/srch/bloodgroup/"+location,Patient[].class);
					
			Donor[] donors1=this.template.getForObject("http://DONOR-SERVICE/api/v1/donors/srch/bloodgroup/"+location,Donor[].class);	
			Set<Donor> donors= Arrays.stream(donors1).collect(Collectors.toSet());
			Set<Patient> patient= Arrays.stream(patient1).collect(Collectors.toSet());
			dto.setPatient(patient);
			
		dto.setDonors(donors);
		dto.setPatient(patient);
			
			return dto;
		
		}
	    
		
		
		

}

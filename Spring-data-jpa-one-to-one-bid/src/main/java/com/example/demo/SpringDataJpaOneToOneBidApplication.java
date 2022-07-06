package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;



@SpringBootApplication
public class SpringDataJpaOneToOneBidApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOneToOneBidApplication.class, args);
		
		
		 
		 Utility obj = ctx.getBean(Utility.class);
     obj.create();
    // obj.findAll();
		 
		 ctx.close();
		 
		 
		 
	}
	
	
	@Bean
	
	public Doctor vini() {
		
		Doctor doc= new Doctor();
		doc.setDoctorId(103);
		doc.setDoctorName("moni");
		doc.setDepartment("ortho");
		doc.setPhoneNumber(9456439);
		return doc;
	}
	
	@Bean
	public Patient kavitha() {
		
		return new Patient(206,"kavitha",9443821);
	}
	
	@Bean
	public Patient pavi() {
		
		return new Patient(207,"pavi",94435768);
	}
	
	@Bean
	public Patient savitha() {
		
		return new Patient(208,"savitha",94435768);
	}
	
	}



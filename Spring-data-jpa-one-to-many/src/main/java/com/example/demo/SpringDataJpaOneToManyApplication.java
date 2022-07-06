package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		 
		 DoctorUtils obj = ctx.getBean(DoctorUtils.class);
       obj.create();
       obj.findAll();
		 
		 ctx.close();
		 
		 
		 
	}
	
	
	@Bean
	
	public Doctor vini() {
		
		Doctor doc= new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("vini");
		doc.setDepartment("ortho");
		doc.setPhoneNumber(9456439);
		return doc;
	}
	
	@Bean
	public Patient kavitha() {
		
		return new Patient(200,"kavitha",9443821);
	}
	
	@Bean
	public Patient pavi() {
		
		return new Patient(201,"pavi",94435768);
	}
	
	@Bean
	public Patient savitha() {
		
		return new Patient(202,"savitha",94435768);
	}
	

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		
		Doctor bhuvi = ctx.getBean(Doctor.class);
		DoctorService service= ctx.getBean(DoctorService.class);
		//service.findAll().forEach(System.out::println);
		
		service.findByDepartment("ortho").forEach(System.out::println);
		
		service.findByNameAndDept("bhuvisha","ortho").forEach(System.out::println);
		
		//service.findByDocName("sindhu").forEach(System.out::println);
		System.out.println(service.findByDocName("sindhu"));
		
		System.out.println(service.findByNameAndDepart("usha","dentist"));
		
		
	
		//System.out.println(service.findAll());
//	Doctor added = service.add(bhuvi);
//		if(added!=null ) {
//		System.out.println("one Doctor added");
//		}
		
		ctx.close();
	}
	@Bean
	
	public Doctor bhuvi() {
		
		return new Doctor(565,"bhuvisha","ortho",45495632);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SingleTablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= 
				SpringApplication.run(SingleTablePerClassHierarchyApplication.class, args);
		
	InsuranceService service= ctx.getBean(InsuranceService.class);
	
	//service.addHealthPolicy();
	
	//service.addLifePolicy();
		
	//	service.getHealthPolicy();
		service.getLifePolicy();
		
		ctx.close();
	}

	
	
	

	@Bean
	public LifeInsurance life() {
		
		return new LifeInsurance(10023,"shree",45,"it service");
		
	}
	
	
	@Bean
	public HealthInsurance health() {
		
		return new HealthInsurance(493747,"sena",48,"diabetic");
		
	}
}



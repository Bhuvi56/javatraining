package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration

public class AppConfig {
	//id of the bean as the method name
	@Bean
	
	public Student ram() {
		
		return new Student(101,"ramesh",89);
	}
	@Bean
	public Teacher bhuvi() {
		return new Teacher(34,"bhuvi","electronis");
		
	}
	
	@Bean
	public Customer jaanu() {

	return new Customer(101,"jaanu");
	}

	@Bean
	public Product tv() {

	return new Product(101,"sony Tv");
	}
	
	@Bean
	public Customer baanu() {

	return new Customer(101,"baanu");
	}



   @Bean
   public Customer anu() {

    return new Customer(101,"anu");
}

}
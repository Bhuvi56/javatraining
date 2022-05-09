package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.repos.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication

public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringJdbcApplication.class, args);
	
	ProductRepository repo=context.getBean(ProductRepository.class);
	
	
	Product tv=context.getBean(Product.class);
	//System.out.println("Row Added:"+repo.add(tv));
	repo.findAll().forEach(System.out::println);
//	System.out.println(" findByid:=" +repo.findById(47));
	
  // System.out.println("one row removed:="+ repo.remove(46));
	Product fridge =context.getBean(Product.class);
	//System.out.println("one row updated:=" +repo.update(fridge));
	
	  // find by id
	System.out.println("findby id:="+repo.findById(94).get());
 
  
	}
	
	@Bean
	public Product tv() {
		return new Product(11,"bag",450.0);
	}
	
	@Bean 
	@Primary
	public Product fridge() {
		return new Product(94,"system",400.0);
	}
	

}
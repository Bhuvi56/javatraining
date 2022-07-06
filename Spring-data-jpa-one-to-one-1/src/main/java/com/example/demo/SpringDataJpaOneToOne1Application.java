package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;


@SpringBootApplication
public class SpringDataJpaOneToOne1Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx=
		SpringApplication.run(SpringDataJpaOneToOne1Application.class, args);
		
		
	
		Seminar obj = ctx.getBean(Seminar.class);
		SeminarRepository repo = ctx.getBean(SeminarRepository.class);

		
		System.out.println( repo.findAll());
		
		
//		Seminar added =repo.save(obj);
//		if(added!=null) {
//			
//			System.out.println("one record is added");
//		}
	}
	
	@Bean
	
	public Seminar vini() {
		
		return new Seminar(101,"TechnicalSeminar",20,kavitha());

	
	}

	@Bean
	
public Speaker kavitha() {
		
		return new Speaker(200,"kavitha","B.E");
	}
	


}

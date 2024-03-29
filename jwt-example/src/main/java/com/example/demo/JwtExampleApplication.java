package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(JwtExampleApplication.class, args);
	//System.out.println(ctx.getBean(BCryptPasswordEncoder.class).encode("india"));
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")

public class BookController {
	
	
	@Value("${server.port}")
	private String port;
	
	
	@GetMapping(path = "/books")
	public List<String>getBooks(){

		return Arrays.asList("java","spring in action","c++");
	}

	
	@GetMapping(path="/books/{id}")
	public String getBookById(@PathVariable int id) {
		
		if(id==1) {
			return "java"+port;
		}else {
		    return	"spring in action"+port;
		}
	}
}

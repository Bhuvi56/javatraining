package com.example.demo.controllers;

import java.util.HashMap;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/catalogs")
public class CatalogController {
	
	@GetMapping
	public HashMap<String,String> getDetails(){
		HashMap<String,String>details=new HashMap<>();
		
		details.put("sedan","Rs.23 perKm");
		details.put("bag", "Rs.45");
		details.put("auto", "Rs.45");
		return details;
	}

}

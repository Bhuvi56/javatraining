package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

	
	



	public double getInterestRate(int value) {
	
		System.out.println("value in service"+value);
	
		return 4.5;
	}
}

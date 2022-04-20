package com.training.services;

import com.training.ifaces.Conditional;

public class Application {

	public static void main(String[] args) {
		
		
		StudentResultServices services = new StudentResultServices();
		
		System.out.println("in pass:="+services.test(90.00));
	     
		System.out.println("is fail:="+services.negate(90.00));
		
		System.out.println(Conditional.getMessage());

	}

}

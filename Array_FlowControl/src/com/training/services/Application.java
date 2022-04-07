package com.training.services;

import com.training.model.*;
public class Application {

	public static void main(String[] args) {
		BankAccountServices service = new BankAccountServices();
		
		BankAccount ram = new BankAccount(1200,"ramesh",5000);
		
		double simpleInterest = service.calculateInterest(ram);
		
		System.out.println("simple interest@6%:="+simpleInterest);
		
        BankAccount shyam= new BankAccount(6200,"rajesh",5000);
		
		double simpleInterest2 = service.calculateInterest(shyam);
		
		System.out.println("simple interest@5%:="+simpleInterest2);
		
	
		BankAccount[] accounts = {ram,shyam};
		service.calculateInterest(accounts);
		System.out.println("=========Arrays============");
		BankAccount[]accountList = {
				new BankAccount(800,"jay",5000,"savings"),
				new BankAccount(801,"kam",6000,"fixed"),
				new BankAccount(802,"tom",7000,"recurring"),
		};
		double[] values = service.findInterest(accounts);
		for(double eachValue:values) {
			System.out.println(eachValue);
		}
		
		
		double[] interestValues = service.findInterestByAccountype(accountList);
		    for(double eachvalue:interestValues) {
			System.out.println(eachvalue);
		}
		
		

	}

}

package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.DiscountCalculator;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //super type= new sub type
		Function conv = new CurrencyConverter();
		System.out.println(Function.COUNTER); 
		System.out.println(conv.apply(200));
		System.out.println(conv.apply(300));
		if(conv instanceof CheckCondition) {
			
			CheckCondition obj = (CheckCondition)conv;
			System.out.println("is discount allowed:=" + obj.test(300));
		}
		else {
				System.out.println("cannot be cast");
			}
		
		Conditional conObj = new DiscountCalculator();
		System.out.println(conObj.test(6000));
		System.out.println(conObj.negate(6000));
	}
	}



package com.training;

import java.util.Optional;

public class UsingOptional {

	public  static Optional<String>getValue(int key){
		Optional<String> response = Optional.empty();
		
		if (key ==1) {
			response= Optional.of("hi");
		}
		return response;
	}
	public static Object getString(int key) {
	
		switch (key) {
		case 1:
			
			return new String("chocobar");
		case 2:
			return new StringBuffer("cassatta");
			 
		default:
			return null;
		}
	}	
public static void main(String[] args) {
	//will throw null pointer exception for values 3 and above
	
	//System.out.println(getString(3).toString());
	
	//avoid nullpointer exception and return a default value
	//new feature of java8 optional class used
	
	//here we are checking if the value is present
	// it its present then only we will call get method
	Optional<Object> optional = Optional.ofNullable(getString(3));
	
	System.out.println(optional.orElse("vannila").toString());
	

	
	
	
	Optional<Object> opt2 = Optional.ofNullable(getString(3));
	
	if(opt2.isPresent()) {
		System.out.println("value is present"+ opt2.get());
		
	}else {
		System.out.println("value is not present");
	}
	
	Optional<Object> opt3 = Optional.ofNullable(getString(2));
	
	opt3.orElseThrow(()-> new RuntimeException("no object for value 3 try again"));
	
	
	
	
	Optional<String> opt4 = getValue(1);
	
	if(opt4.isPresent()) {
		System.out.println(opt4.get().toString());
	}else {
	System.out.println("invalid");
	
	//Optional<String> opt5= Optional.ofNullable(getValue(2));
	opt4.orElseThrow(()->new RuntimeException("no object for value 2"));
}
	}
}




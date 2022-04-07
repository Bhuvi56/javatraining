package com.training.services;
import java.util.*;
import com.training.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Student ram = null;
		try {
			ram = new Student(1010, "ramesh",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 StudentServices service = new StudentServices(ram);
		 
		 System.out.println(service.printDetails());
		 
		 StudentServices services = new StudentServices(ram);
		 try {
			System.out.println(services.findRank());
		 }catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("name is not passed");
		
	}
		 ExceptionHandling exHandling = new ExceptionHandling();
    	 exHandling.usingArrayIndexException(args);
	    exHandling.usingNumberFormatException("4");
//	    try {
		System.out.println(exHandling.underStandFinallyBlock());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    //try with resources - scanner will be closed 
	    try(Scanner scan = new Scanner(System.in)){
	    	System.out.println("enter number");
	    	int num = scan.nextInt();
	    	System.out.println(num);
	    }catch(Exception e) {
	    	System.err.println("error");
	    	
	    	
	    }
}}




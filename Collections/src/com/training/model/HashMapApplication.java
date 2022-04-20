package com.training.model;
import java.util.*;
public class HashMapApplication {

	public static void main(String[] args) {
		

		Student ram = new Student(101,"ram",48);
		Student ramu = new Student(102,"ramu",48);
		Student raman = new Student(103,"raman",48);
		
		
		HashMap<Integer,Student> map= new HashMap<>();
		
	  System.out.println(  map.put(900, ram));
	   System.out.println( map.put(500,ramu));
	   
	   
	  Student added = map.put(500,raman);
	  if(added!=null) {
		  map.put(904,added);
	  }
	    
	   //` System.out.println(map.get(900));
	    System.out.println(map.get(500));
	    System.out.println(map.get(904));
	}

}

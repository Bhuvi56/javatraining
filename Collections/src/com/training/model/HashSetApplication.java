package com.training.model;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		

		Student ram = new Student(101,"ram",48);
		Student ramu = new Student(101,"ram",48);
		Student ramesh = new Student(103,"ramesh",98);
		// TODO Auto-generated method stub
		Student rajesh = new Student(103,"rajesh",88);
		
		Set<Student>set = new HashSet<>();
        
		
		set.add(rajesh);
		set.add(ramesh);  
		set.add(ramu);
		set.add(ram);
		System.out.println(set);
		System.out.println(set.size());
	}

}

package com.training.model;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"ram",48);
		Student ramu = new Student(102,"ram",48);
		Student ramesh = new Student(103,"ramesh",98);
		// TODO Auto-generated method stub
		Student rajesh = new Student(104,"rajesh",88);
		
		Set<Student>set = new TreeSet<>();
        
		
		set.add(rajesh);
		set.add(ramesh);
		set.add(ramu);
		set.add(ram);
		
		 for(Student eachStudent:set) {
			 System.out.println(eachStudent.getFirstName());
		 }
	}

}

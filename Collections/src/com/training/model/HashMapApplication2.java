package com.training.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApplication2 {

	public static void main(String[] args) {
		
		

		Student ram = new Student(101,"ram",48);
		Student ramu = new Student(102,"ramu",48);
		Student raman = new Student(103,"raman",48);
		
		
		HashMap<Integer,Student> map= new HashMap<>();
		
		
		map.put(900,ram);
		map.put(902,ramu);
		map.put(903,raman);
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
        
		
		 Collection<Student> list =map.values();
		 for(Student eachStudent:list) {
			 System.out.println(eachStudent);
		 }
		 
		 System.out.println("both key and values");
		 
		 Set<Map.Entry<Integer, Student>> list2 =map.entrySet();
		 for(Map.Entry<Integer, Student> eachEntry:list2 ) {
			 System.out.println(eachEntry.getKey());
			 System.out.println(eachEntry.getValue());
		 }
	}
	

}

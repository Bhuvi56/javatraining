package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
public class HandleDuplicates {

	public static void main(String[] args) {
		
		List<Integer> ageList = Arrays.asList(45,55,65,78,99,67,56,45,55);
		
		Set<Integer> filtered = new HashSet<>();
		
		List<Integer>list = ageList.stream().filter(e->filtered.add(e)).collect(toList());
		
		System.out.println(list);



	}

}

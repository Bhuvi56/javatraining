package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import com.example.Student;

public class Application {

	public static void main(String[] args) {
		
		Student ram= new Student(101,"ram",LocalDate.of(1955,9,17),
				          LocalDateTime.of(2022, Month.JUNE,5,9,30));
		
		
		Student shyam = new Student(102,"shyam",LocalDate.now(),LocalDateTime.now());
		
		
		System.out.println("ram year of birth:" +ram.getDateOfBirth().getYear());
		
		System.out.println("rams first birth:" +ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		System.out.println("shyam year of birth:" +shyam.getDateOfBirth().getYear());

		
		System.out.println("shyams sixty birth:" +shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
		
		System.out.println("shyam previous birthday:"+shyam.getDateOfBirth().plus(2,ChronoUnit.MONTHS));
	}

}

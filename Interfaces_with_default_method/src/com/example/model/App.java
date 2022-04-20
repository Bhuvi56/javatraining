package com.example.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.example.Student;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth = "1990-08-10";
		
		
		Student vicky = new Student();
		
		vicky.setRollNumber(200);
		vicky.setStudentName("vignesh");
		vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
		vicky.setDateOfJoining(LocalDateTime.now());
		
		
		System.out.println("year:=" +vicky.getDateOfBirth().getYear());
		
		System.out.println("month:=" + vicky.getDateOfBirth().getMonth());
		
		System.out.println("day:="+ vicky.getDateOfBirth().getDayOfMonth());
		
		
		LocalTime startTime = LocalTime.of(9,30);
		
	    LocalTime endTime = startTime.plus(8,ChronoUnit.HOURS);
		
	    System.out.println("starttime:" + startTime);
		
	    System.out.println("endtime:"+endTime);
		

	}

}

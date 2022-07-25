package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Patient {
	
	
	int patientId;

	String patientName;

	long mobileNumber;
	

	String location;
	

	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	
	
	String bloodGroup;


}

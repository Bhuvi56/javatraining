package com.example.demo.entity;

import java.time.LocalDate;



import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class Donor {
	

	int donorId;

	String donorName;
	

	long mobileNumber;

	String location;
	
	
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate dateOfBirth;
	

	String bloodGroup;

}

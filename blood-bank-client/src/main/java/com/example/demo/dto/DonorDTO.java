package com.example.demo.dto;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Donor;
import com.example.demo.entity.Patient;

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
public class DonorDTO {
	
	private Set<Patient> patient;
	private Set<Donor>donors;

}

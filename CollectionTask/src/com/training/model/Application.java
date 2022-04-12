package com.training.model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.Patient;
import com.training.appointment.Appointment;
import com.training.doctor.Doctor;

public class Application {

	public static void main(String[] args) {
		
		
		
		
		Patient anbu = new Patient(101,"anbu","tvmalai",9548557);
		Patient adhi = new Patient(102,"adhi","sepet",9548357);
		Patient aruvi = new Patient(103,"aruvi","tpet",95421157);
		Set<Patient> details = new HashSet<>();
		details.add(anbu);
		details.add(adhi);
		details.add(aruvi);
		Doctor bhuvi = new Doctor(201,"bhuvi","heart",details);
		Doctor pavi = new Doctor(202,"pavi","artho", details);
		
		Map<Doctor,Set<Patient>>  map=new HashMap<>();
		Appointment appointment = new Appointment(map);
		//map.put(bhuvi,adhi);
		map.put(pavi, details);
		System.out.println(map.get(pavi));
		//System.out.println(map.get(bhuvi));
		
		
		 
		
	  
		
		
		
		
		// TODO Auto-generated method stub

	}

	
}

package com.training.appointment;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.Patient;
import com.training.doctor.Doctor;

public class Appointment {
	
	 private Map<Doctor,Set<Patient>> map;

	public Appointment() {
		super();
		map=new HashMap<>();
		
		// TODO Auto-generated constructor stub
	}

	public Appointment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}

	public Map<Doctor, Set<Patient>> getMap() {
		return map;
	}

	public void setMap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}

	public Set<Patient>getPatients(Doctor key){
		return this.map.get(key);
	}
}

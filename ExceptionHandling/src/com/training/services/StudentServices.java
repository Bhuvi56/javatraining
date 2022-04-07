package com.training.services;

import com.training.model.Student;

public class StudentServices {
	private Student student;

	public StudentServices(Student student) {
		super();
		this.student = student;
	}

	public StudentServices() {
		super();
		// TODO Auto-generated constructor stub
		
		//applying handle rule 
	}
	public String printDetails() {
		
		String name=null;
		try {
		
		name = this.student.getFirstName();
		} catch (NullPointerException e) {
			System.err.println("student object is not passed check again");
		}
		return name;
	}
	//apply declare rule
	public String findRank()throws Exception{
		String grade = "A";
		if(this.student.getMarkScored()>90) {
			grade = "o";
		}
		return grade;
		
	}

}

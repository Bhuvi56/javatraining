package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		
		//ram.rollNumber =101;
		ram.setRollNumber(56020);
		//unable to access because  student class is in com.example.model package
		//and apllication is in com.example package
		//ram.setFirstName("ram");
		//unableto access because appicaton is not a subclass
		//of student
		//ram.setMarkScored(45);
		//unable to access because private method
		//ram.setBranch("BE");
        
		System.out.println("roll number:"+ram.getRollNumber());
		System.out.println("mark scored:="+ram.getMarkScored());
		System.out.println("Student name:="+ram.getFirstName());
		Student shyam = new Student(455,"shyam",87,"mech");
		System.out.println("Student name:="+shyam.getFirstName());
		Student magesh = new Student(777,"subramani","texttile");
		
		System.out.println("student Name:="+magesh.getRollNumber());
		System.out.println("student number:="+magesh.getMarkScored());
	}

}

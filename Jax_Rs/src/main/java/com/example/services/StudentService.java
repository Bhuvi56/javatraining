package com.example.services;

import java.util.*;
import java.util.stream.*;

import com.example.model.Student;
public class StudentService {
	
	private List<Student> studentList;

	public StudentService() {
		super();
		
		this.studentList = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
	}

      public boolean add(Student student) {
	
	return this.studentList.add(student);
}
     public List<Student>getAll(){
	return this.studentList;
}

     public Optional<Student>findById(int id){
	return this.studentList.stream().filter(e->e.getRollNumber()==id).findFirst();
}
    public boolean remove(int id) {
	return this.studentList.removeIf(e->e.getRollNumber()==id);
}
     public Student update(int id,Student newValue) {
	
	int idxPos = this.studentList.indexOf(findById(id).get());
	return this.studentList.set(idxPos, newValue);
}

}

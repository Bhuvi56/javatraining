package org.example.repos;

import java.util.List;
import java.util.Optional;

import org.example.model.Student;

public interface NewStudentRepository {
	
	
	public Student findByRollNumber(int rollNumber);
	
	public List<Student> deleteByRollNumber(int rollNumber);

}

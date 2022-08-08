package org.example.newservice;

import java.util.Optional;

import org.example.model.Student;
import org.example.repos.NewStudentRepository;


public class NewStudentService {
	
	private NewStudentRepository newStudRepo;

	public NewStudentService(NewStudentRepository newStudRepo) {
		super();
		this.newStudRepo = newStudRepo;
	}

	
	public Student getByRollNumber(int rollNumber){
		return this.newStudRepo.findByRollNumber(rollNumber);
	}
	
//	public void remove (int rollNumber) {
//		Optional<Student> foundElement = newStudRepo.findByRollNumber(rollNumber);
//		if(foundElement.isPresent()) {
//			newStudRepo.deleteByRollNumber(rollNumber);
//		}else {
//			throw new RuntimeException("Element with"+rollNumber+"not present");
//		}
//	}
	
//	public Student  findByRollNumber (int rollNumber) {
//		Student found=this.newStudRepo.findByRollNumber(202).get();
//	return found;
	
//	}
}

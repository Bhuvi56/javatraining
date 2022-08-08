package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;
import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithDummy {
	
	@Test
	@DisplayName("Test Add Method Return inserted object back")
	void  testAddMethod() {
		
		StudentRepoFake  fake = new StudentRepoFake();
		
		DummyProfessorRepository dummy= new DummyProfessorRepository();
		StudentService service= new StudentService(fake,dummy);
				
		Student bhuvi=new Student(101,"bhuvi");
		Student actual= fake.add(bhuvi);
		assertEquals(actual,bhuvi);
		
	}

}

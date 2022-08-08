package org.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithFake {

	
	@Test
	@DisplayName("Test Add Method Return inserted object back")
	void  testAddMethod() {
		
		StudentRepoFake  fake = new StudentRepoFake();
		StudentService service= new StudentService(fake);
				
		Student bhuvi=new Student(101,"bhuvi");
		Student actual= fake.add(bhuvi);
		assertEquals(actual,bhuvi);
		
	}
	
	
	@Test
	@DisplayName("Test findall Method Return all the elements added")
	void testFindAll() {
		StudentRepoFake  fake = new StudentRepoFake();
		StudentService service= new StudentService(fake);
	     
		Student bhuvi=new Student(104,"bhuvi");
		Student bhuvima=new Student(102,"bhuvima");
         
		
		Student one= service.add(bhuvi);
        Student two = service.add(bhuvima);
      
            int actual= service.findAll().size();
            int expected=2;
            assertEquals(2,actual);


}
}

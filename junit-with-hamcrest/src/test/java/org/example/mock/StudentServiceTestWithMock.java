package org.example.mock;

import org.example.model.Student;
import org.example.services.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {
	
	
	@DisplayName(value = "Test verify Add Method With Mock")
	@Test
	void testAddWithMock() {
		
		StudentServiceMock mock=new StudentServiceMock();
		
		StudentService service= new StudentService(mock);
		
		
		Student bhuvi=new Student(104,"bhuvi");
		Student bhuvima=new Student(102,"bhuvima");
		
		 service.add(bhuvi);
         service.add(bhuvima);
        
        
      //  mock.verify(bhuvi,1);
        mock.verify(bhuvima,2);
		
	}

}

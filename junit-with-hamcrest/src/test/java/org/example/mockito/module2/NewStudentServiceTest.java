package org.example.mockito.module2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;



import org.example.model.Student;
import org.example.newservice.NewStudentService;
import org.example.repos.NewStudentRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class NewStudentServiceTest {
	
	
	@Mock
	NewStudentRepository repo;
	@Mock
	NewStudentService serviceMock;
	
	@InjectMocks
	NewStudentService service;
	
	@Test
	@DisplayName("Test Find by roll number")
	void testFindByRollNumber() {
		Student stud = new Student(202,"bhuvi");

		    when(repo.findByRollNumber(202)).thenReturn(stud); 
		    

		   Student expected = service.getByRollNumber(202);
			
		    assertEquals(expected,stud);
		  
	}
	
	@Test
	public void shouldThrowExceptionWhenElementNotFound() {
		Student stud = new Student(302,"priya");
		when(repo.findByRollNumber(anyInt())).thenThrow(RuntimeException.class);
		assertThrows(RuntimeException.class,()->service.getByRollNumber(560));
		
	}

	
	

	

	


		
	

}

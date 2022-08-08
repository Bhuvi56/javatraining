package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.services.StudentService;
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository repo;
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService service;
	
	
	
	
	@Test
	@DisplayName("Test Find All With mockito stub")
	void testFindAll() {
		
//		StudentRepository repo=mock(StudentRepository.class);
//		
//		StudentService service = new StudentService(repo);
//		
	     

		Student stu1 = new Student(901, "bhuvi");
		Student stu2=new Student(902, "vini");
	    List<Student> list = new ArrayList<>();
	    
	    list.add(stu1);
	    list.add(stu2);

	  //stubbing
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(service.findStudentSize(), 2);
	}
	
	

	
	@Test
	@DisplayName("Test Add method of service it should add elements only if the "+ 
	"rollnumber is greater than 2000 else it should return a null value")
	
	void testFindAdd() {
		
		
		Student stud= new Student(2002, "bhuvi");
		
		assertNotNull(service.addWithCondition(stud));
//		verify(service.addWithCondition(),times(1));
		
	}
	
	@Test
	void verifyAddWithCondition() {
		
		Student stud = new Student(2020,"bhuvi");
		
		serviceMock.addWithCondition(stud);
		
		verify(serviceMock,times(1)).addWithCondition(stud);
	}

}

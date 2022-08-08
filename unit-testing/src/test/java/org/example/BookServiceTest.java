package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.List;

import org.example.model.Book;
import org.example.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {
	
	BookService service=null;
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info) {
		
		service=new BookService();
		System.out.println(info.getDisplayName()+"called");
	}
	
	@Test
	@DisplayName("test booklist notnull")
	void testBookNotNull() {
		

		Object actual= service.getBooklist();
		assertNotNull( actual);
	}
	
	@Test
	@DisplayName("test add method should return 1 for success and 0 for failure to insert")
	void testBookAdd() {
		
		
		int actual=service.addBook(new Book());
	    int expected =0;
		assertEquals(expected, actual);
	

}
	
	@Test
	@DisplayName("test add method should return 1 for success and 0 for failure to insert")
	void testBookAdd1() {
	
		Object actual= service.addBook(new Book());
	    int expected =1;
		assertEquals(expected,(int) actual);
	

}
	
	
	@Test
	@DisplayName("test add method should not accept duplicate value")    
	void testBookDuplicate() {
	
     assertAll("Test Add Book",
    		 ()->assertEquals(1,service.addBook(new Book(102,"java",450))),
    		 ()->assertEquals(0,service.addBook(new Book(102,"java",450)))
    		 );
	
		
	}
	
	
	@Test
	@DisplayName("If the Element is not found in the collection  removeBook method should throw RunTime exception with message Element not found ")	
	void testRemoveBook() {
	  Throwable exception=
			  assertThrows(RuntimeException.class, ()->service.removeBook(new Book(103,"spring",450)));
	  assertEquals("Element not Fount",exception.getMessage());
		
}
	@ParameterizedTest

	@DisplayName("Test if getbestbook method has the value Head First java in one first three positions")
	@ValueSource(ints= {0,1,2})
	void testGetBestBook(int pos) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("Windows"));

		assertEquals("head First java",service.getBestBooks().get(pos));

		
	}

}

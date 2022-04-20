package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		
		Book java = new Book (101," java","rak",780);
		
		BookService service = new BookService();
		
		boolean result = service.writeToFile(new File("Book.txt"), java);
		
		if(result) {
			System.out.println("one recored added to file");
		}
		// TODO Auto-generated method stub

		
		service.readFromFile(new File("Book.txt")).forEach(System.out::println);
		}
	
	

}

package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class AppForStream {

	public static void main(String[] args) {
	
		BookService service = new BookService();
		File file = new File("book.ser");
		int ch=2;
		
		if(ch==1) {
		
		Book book = new Book(557,"oracle","bhuvi",560);
		
		boolean result = service.writeToStream(file, book);
		
		if(result) {
			System.out.println("one record serialized");
		}}else
		{
			Book fromFile = (Book) service.readFromStream(file);
			System.out.println(fromFile.getBookName());
			System.out.println(fromFile);
		}
		
	}

	}


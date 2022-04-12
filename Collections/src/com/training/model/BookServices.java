package com.training.model;
import java.util.ArrayList;
import java.util.List;;

public class BookServices implements CrudRepository {

	
	
	private ArrayList<Book>bookList;
	@Override
	public boolean add(Book book) {
		
		return bookList.add(book);
	}

	public BookServices() {
		super();
		this.bookList=new ArrayList<>();
		
	}

	@Override
	public Book findById(int id) {
		
		Book found = null;
		for (Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
			found = eachBook;
			}
			
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook, Book newBook) {
	
		if(this.bookList.contains(oldBook)) {
			//System.out.println("inside if block****");
			
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos,newBook);
					
		
		}
		return newBook;
	}

}

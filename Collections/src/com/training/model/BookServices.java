package com.training.model;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;;

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
	
	
	public List<Book> getBooksGrtThan (double price){
		List<Book> grtThanList = new ArrayList<>();
		Predicate<Double>grtThan =(value)->value>800.00;
		
		
		this.bookList.forEach(book->
		{
			double bookPrice = book.getPrice();
			if(grtThan.test(bookPrice)) {
		    grtThanList.add(book);
	     }
	});
	return grtThanList;
		}}
	

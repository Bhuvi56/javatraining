package com.training.model;
import java.util.Comparator;

public class BookNameComparison implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}
	

}

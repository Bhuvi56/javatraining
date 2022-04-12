package com.training.model;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names = new ArrayList<>();
		
		names.add("ananth");
		names.add("nathiya");
		names.add("bhuvi");
		names.add("ghuvi");
		names.add("sindhu");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

		Book java = new Book(101,"java","suba",450);
		Book spring = new Book(102,"spring","bhuvi",650);
		Book css = new Book(103,"css","sharmi",550);
		Book html= new Book(104,"html","sindhu",4500);
		Book python= new Book(105,"python","subi",850);
		
		CrudRepository service = new BookServices();
		
		System.out.println("is added:="+service.add(java));
		service.add(spring);
		service.add(css);
		service.add(html);
		service.add(python);
		
	List<Book> bookList=service.findAll();
	Collections.sort(bookList);
	System.out.println("sort by number");
	
	System.out.println(bookList);
	Collections.sort(bookList,new BookNameComparison());
	System.out.println("sort by book name");
	System.out.println(bookList);
	
	

	}

	
}

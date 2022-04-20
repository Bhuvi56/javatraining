package com.training.model;


import java.util.List;



public class Application {
    public  static void print(List<Book> arg) {
    	
    	for(Book eachBook:arg) {
    		System.out.println(eachBook);
    	}
    	
    }
		
	
	public static void main(String[] args) {
		
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
		
		List<Book>bookList = service.findAll();
		for(Book eachBook:bookList) {
		System.out.println(eachBook);
	}
		
		List<String>nameList = ((BookServices)service).getBookNames();
		nameList.forEach(System.out::println);
		
		System.out.println("======================");
		List<String>grtThanNineHundred = ((BookServices)service).getBookNameGrtThanThanPrice(900);
		grtThanNineHundred.forEach(System.out::println);
		System.out.println("=====================");
		System.out.println("sorted by name");
		List<Book>sortedByName = ((BookServices)service).sortedByName();
		sortedByName.forEach(System.out::println);
		
		System.out.println("========================");

		System.out.println("sorted by number");
		List<Book>sortedByNumber = ((BookServices)service). sortedByNumberDecending();
		sortedByNumber.forEach(System.out::println);
		
		//bookList.forEach(System.out::println);
		System.out.println("grt than 400");
		List<Book> bookList1= ((BookServices)service).getBooksGrtThan(840);
		bookList1.forEach(System.out::println);
		
		System.out.println("using streams");
		((BookServices)service).findBooksGrtThan(100).forEach(System.out::println);
		
	Book foundBook = service.findById(101);
	System.out.println("found book"+foundBook);
	service.remove(python);

	System.out.println("=========");
	print(service.findAll());
	
	Book react =new Book(205,"react","bhuvana",5445);
service.add(react);
System.out.println("=======");
Book reactBook=new Book(205,"reactjs","butij",5785);
print(service.findAll());
service.update(react, reactBook);
System.out.println("==========");

	List<Book> secondList=service.findAll();
	
	for(Book eachBook:secondList) {
		System.out.println(eachBook);
		
	}
        
	System.out.println();
	
		// TODO Auto-generated method stub

	}

}

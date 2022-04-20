package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.training.model.*;


public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
	
	}
	
	
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> bookSet = bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
		bookSet.forEach(System.out::println);
	}
	

	
	public static void collectToMap(List<Book> bookList) {
		
		Map<String,Double> values = bookList.stream().filter(e->e.getPrice()>500).distinct().collect(toMap(Book::getBookName,Book::getPrice));
		values.forEach((key,value)-> System.out.println(key+ ","+value));
	}


public static void findMaxPrice(List<Book> bookList) {
	
	Optional<Book> optional = bookList.stream().max(Comparator.comparing(Book::getPrice));
	
	if(optional.isPresent()) {
		System.out.println("maximum price:="+optional.get().getPrice());
	}
}
	


public static void findMinPrice(List<Book> bookList) {
		
		Optional<Book> optional = bookList.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("minimum price:="+optional.get().getPrice());
		}
	 
}
	
	public static void findCountBookWithChar(List<Book> bookList) {
		
		 long  countresult= bookList.stream().
	             filter((e ) -> e.getBookName().contains("s")).count();
		 System.out.println("bookName:="+countresult);

	}
	
	// above method same but passing the value into switvh case
//	public static void findCountBookWithChar(List<Book> bookList,String srchString) {
//		
//		 long  countresult= bookList.stream().
//	             filter((e ) -> e.getBookName().contains(srchString)).count();
//		 System.out.println("bookName:="+countresult);
//
//	}


	public static void main(String[] args) {
		
		Book java = new Book(101,"java","suba",450);
		Book spring = new Book(102,"spring","bhuvi",650);
		Book css = new Book(103,"css","sharmi",550);
		Book html= new Book(104,"html","sindhu",4500);
		Book python= new Book(105,"python","subi",850);
		Book html2= new Book(104,"html","sindhu",4500);
		Book python3= new Book(105,"python","subi",850);
		
		List<Book> bookList = Arrays.asList(java,spring,css,html,python,html2,python3);
		
		int key=6;
		switch (key) {
		case 1:
			useDistinct(bookList);
			
			break;
		case 2:
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
			break;
		case 6:
			findCountBookWithChar(bookList);
            break;
		//case 7:
		//	findCountBookWithChar(bookList,'v');
		default:
			break;
		}
		//useDistinct(bookList);
		 //collectToSet(bookList);
		//collectToMap(bookList);
		
		//findMaxPrice(bookList);
		
	}

}

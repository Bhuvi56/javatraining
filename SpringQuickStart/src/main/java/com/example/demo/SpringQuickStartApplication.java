package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication
@ComponentScan(basePackages = { "org.training","com.example"})
public class SpringQuickStartApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=SpringApplication.run(SpringQuickStartApplication.class, args);
		
		// when using id need to cast to specific Bean since
		//return type of getBean Method is Object
		
		Student ram= (Student) ctx.getBean("ram");
		
		// casting not requried ,but there should be only one bean of that type
		// will throw Excption
		System.out.println(ctx.getBean(Student.class));
		
		// When more than one Bean of the sametype available
		//should use id and class name

		Teacher stella1 = ctx.getBean("bhuvi",Teacher.class); 
	    
		Teacher stella = ctx.getBean("teacher",Teacher.class);
		stella.setId(44);
		stella.setName("bhuvana");
		stella.setSubject("Singal system");
		System.out.println(stella);
		System.out.println(stella1);
		
		
		
		System.out.println(ctx.getBean(Book.class));
		
		System.out.println(ctx.getBean("bhuvisha",Author.class));
		System.out.println(ctx.getBean(Author.class));
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println(inv);
		
	    Bill bill = ctx.getBean(Bill.class);
		
		System.out.println("Customer:="+bill.getCustomer());
		System.out.println("Product:="+bill.getProduct());
		
		Bill bill2 = ctx.getBean("bill",Bill.class);
		System.out.println(bill2);
		
		

		CustomerList list = ctx.getBean("customerList",CustomerList.class);
		System.out.println(list);
	}
	
	@Bean 
	public Author bhuvisha() {
		return new Author(101,"sindhu");
	}
	@Bean
	@Primary
	public Author mani() {
		return new Author(102,"sangavi");
	}

}

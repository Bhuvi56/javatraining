package com.example;


// sonar:sonar -Dsonar.host.url=http://localhost:9000 
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.utils.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void member() {
		
	}
	
	public static void product() {
		
	
		Connection con;
		con= ConnectionFactory.getPostgressConnection();
		
			ProductService service= new ProductService(con);
			
			Product toAdd =new Product(56,"ups",109.00);
			int rowAdded=service.addProduct(toAdd);
			System.out.println("row Added:=" +rowAdded);
		
		
	}
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        Connection con;
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.107:1521/SIT","HR","HR");
			con=ConnectionFactory.getOracleConnection();
			//con=ConnectionFactory.getPostgressConnection();
			 
			// MemberRepository member= new MemberRepository(con);
			// member.findAll().forEach(System.out::println);
			 
			// int rowsRemoved = member.remove(5);
			// System.out.println("row deleted:="+rowsRemoved);
			 
            ProductService service = new ProductService(con);
	    	
          
            Product kathli = new Product(51,"APP",500);
	    	
	//    Product jamun = new Product(96,"phone",1000);
	    	
	    //	service.usingTxn(kathli,jamun);
	    	
	    	Invoice obj = new Invoice(206,"saratha",450,94);
	    	
	    service.usingTxnWithCatchBlock(kathli, obj);
			 
			 
		System.out.println(con);
    }catch(Exception e) {
        
    	e.printStackTrace();
    }
    	
    	//
    	//product();
    	
    	
    	
    	
    	
}
}

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;


import com.example.ifaces.CrudRepository;
import com.example.utils.ConnectionFactory;
import com.taining.services.CustomerServices;
import com.training.LoanApplication;
import com.training.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
        

         Connection con;
 		try {
 			
 			con=ConnectionFactory.getOracleConnection();
 			
 			 
			CustomerServices customer= new CustomerServices(con);
			
			
 			
			
		Customer cust = new Customer(204,"sindhu",34968686,500);
		LoanApplication loan =new LoanApplication(2004, cust, 3000);
			
	//	int rowAdded= customer.add(loan);
		//	System.out.println("row Added:=" +rowAdded);

			//int rowsRemoved = customer.remove(201);
			//System.out.println("row deleted:="+rowsRemoved);
		
		
		//int rowsUpdate = customer.update(204, 49324);
		//System.out.println("row updated:="+rowsUpdate);  
		
			customer.findAll().forEach(System.out::println);

 			 
 			System.out.println(con);
 	    }catch(Exception e) {
 	        
 	    	e.printStackTrace();
 	   }
    }
}

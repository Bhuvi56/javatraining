package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		
		
		try {
			Connection con= DriverManager.getConnection
					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			ProductService service= new ProductService(con);
			
			Product toAdd =new Product(56,"ups",109.00);
					
			
			//int rowAdded=service.addProduct(toAdd);
			//System.out.println("row Added:=" +rowAdded);
			
			//int rowsDeleted = service.deleteById(56);
			//System.out.println("row deleted:="+rowsDeleted);
			
			//int rowsUpdate = service.updatePriceByName("tv", 1450);
			//System.out.println("row updated:="+rowsUpdate);
			
			Optional<Product> found = service.findById(30);
			if(found.isPresent()) {
				System.out.println(found.get());
			}else {
				System.out.println("product with given id not present");
				
			}
		
			
		
			service.findAll().forEach(System.out::println);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();
	

	}

}

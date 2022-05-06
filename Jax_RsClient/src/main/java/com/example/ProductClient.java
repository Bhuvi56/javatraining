package com.example;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
	 
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/products");
		
		Invocation.Builder builder =  target.request(MediaType.APPLICATION_JSON);

		Response resp = builder.get();
		//System.out.println(resp);
	
		int ch=4;
		if(ch==1) {
		String obj = resp.readEntity(String.class);

         System.out.println(obj);
		}
		if(ch==2) {
			
			WebTarget findByIdTarget = target.path("/10").path("/TV");
		
			Product object2 = resp.readEntity(Product.class);
			System.out.println(object2);
		}
		
		if(ch==3) {
         Product toAdd = new Product(57,"mymobile",4500);
         
         Response response = builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));

         System.out.println(response.getStatus());
         System.out.println(response.readEntity(String.class));


	}
		
		if(ch==4) {
			Product[] object = resp.readEntity(Product[].class);
			System.out.println(object);
			for(Product eachProduct:object) {
				System.out.println(eachProduct);
			}
		}
		

}
	}

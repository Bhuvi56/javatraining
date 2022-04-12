package com.training;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Product;

public class Application {

	public static void main(String[] args) {
		
		
		
		Product list =new Product(101,"fan",50000);
		Product list2 =new Product(102,"mixer",5400);
		Product list3 =new Product(103,"fridge",8000);
		Product list4 =new Product(104,"tablefan",59000);
		
		Set<Product> products=new TreeSet<>();
		
		products.add(list);
		products.add(list2);
		products.add(list3);
		products.add(list4);
		
		
		
		System.out.println();

	}

}

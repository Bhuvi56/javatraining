package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		
		String name = sc.next();
		System.out.println("enter thr farenheit temp:");
		double farenTemp =sc.nextDouble();
		
		 Converter convObj = new Converter();
				System.out.println(convObj.convert(name));
		        System.out.println("celsius temp:="+convObj.convert(farenTemp));
		        System.out.println("enter amount:");
		        double amount = sc.nextDouble();
		        System.out.println("enter the current to convert 1USD 2EURO:");
		        int frm = sc.nextInt();
		        System.out.println(convObj.convert(amount,frm));
		sc.close();

	}

}

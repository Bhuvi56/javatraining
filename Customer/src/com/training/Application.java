package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Customer cusObj = new Customer("bhuvi",965845,"ladakarabai");
	System.out.println(cusObj.getCustomerName());
	System.out.println(cusObj.getCustomerMobileNumber());
	System.out.println(cusObj.getCustomerAddress());
	Employee empObj = new Employee("bala",25000,23);
	System.out.println(empObj.getEmployeeName());
	System.out.println(empObj.getEmployeeSalary());
	System.out.println(empObj.getEmployeeId());
	Hotel hotObj = new Hotel("devahotel",3,"tvmalai");
	System.out.println(hotObj.getHotelName());
	System.out.println(hotObj.getHotelBranch());
	System.out.println(hotObj.getHotelLocation());
		
      Customer jaanu = new Customer();
      Scanner sc =  new Scanner(System.in);
       System.out.println("enter the name:");
      String name =sc.next();
      jaanu.setCustomerName(name);
      
      System.out.println("enter the number:");
      double number =sc.nextDouble();
      jaanu.setCustomerMobileNumber(number);
      
      System.out.println("enter the address:");
      String address= sc.next();
      jaanu.setCustomerAddress(address);
      System.out.println(jaanu.getCustomerName());
      System.out.println(jaanu.getCustomerMobileNumber());
      System.out.println(jaanu.getCustomerAddress());
      
      Employee baanu = new Employee();
      Scanner sc1 =  new Scanner(System.in);
       System.out.println("enter the name:");
      String name1 =sc1.next();
      baanu.setEmployeeName(name1);
      
      System.out.println("enter the salary:");
      double number1 =sc.nextDouble();
      baanu.setEmployeeSalary(number1);
      
      System.out.println("enter the id:");
      int id= sc.nextInt();
      baanu.setEmployeeId(id);
      System.out.println(baanu.getEmployeeName());
      System.out.println(baanu.getEmployeeSalary());
      System.out.println(baanu.getEmployeeId());
      
      Hotel taanu = new Hotel();
      Scanner sc2 =  new Scanner(System.in);
       System.out.println("enter the name:");
      String name2 =sc2.next();
      taanu.setHotelName(name2);
      
      System.out.println("enter the branch:");
      String branch =sc2.next();
      taanu.setHotelLocation(branch);
      
      System.out.println("enter the location:");
      String location= sc.next();
      taanu.setHotelLocation(location);
      System.out.println(taanu.getHotelName());
      System.out.println(taanu.getHotelBranch());
      System.out.println(taanu.getHotelLocation());
      
      sc.close();
      
	
      
      
	}

}

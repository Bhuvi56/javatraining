package com.training;

public class Application {

	public static void main(String[] args) {
		Customer Obj = new Customer();
		try {
			Obj = new Customer(12,"bhuvi",394364728L,"bhuvi@gmail.com");
		} catch (InvaildEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Obj);
		
		// TODO Auto-generated method stub

	}

}

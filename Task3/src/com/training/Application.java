package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectFacory object= new ObjectFacory();
		Automobile maruthi= object.getObject(1);
		Automobile toyota= object.getObject(2);
//		System.out.println(maruthi.toString());
//		System.out.println(toyota.toString());
		object.PrintQuot(maruthi);
		object.PrintQuot(toyota);
	}

}

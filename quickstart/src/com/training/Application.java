package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting grtObj =new Greeting();
		//System s = new System();
		System.out.println(grtObj.getMessage());
		System.out.println("welcome");
		System.out.println(Greeting.getInfo());
		System.out.println(grtObj.getMessage());
        //System.out.println(grtObj.getInfo());
		//static method should be call in static way (class+ method) non static (object+method)
	}

}

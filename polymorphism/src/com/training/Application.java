package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;

public class Application {

	public static void main(String[] args) {
		
		
		NewObjectFactory factory =  new NewObjectFactory();
		
		
		Conditional profObj =factory.getConditional(1);
		Conditional stuObj = factory.getConditional(2);
		//Conditional object = factory.getConditional(1);
		//System.out.println(object.test("chennai"));
		System.out.println("allowance:=" + factory.getValue(profObj,"chennai"));
		System.out.println("allowance:=" + factory.getValue(stuObj, "30"));
		Conditional principalObj =factory.getConditional(3);
		System.out.println("allowance:" +factory.getValue(principalObj, "eng"));
		// TODO Auto-generated method stub

	}

}

package com.training.model;
import com.training.model.Address;
 import com.training.model.MobileBill;
public class Application {

	public static void main(String[] args) {
		Address nameObj= new Address(10,"ladakara","tvmalai");
		MobileBill object = new MobileBill("bhuvi",5868995L,"prepaid",nameObj);
		System.out.println(object.getCustomerName());
		System.out.println(object.getMobilenumber());
		System.out.println(object.getPlanname());
		System.out.println(object.getAddress());
		// TODO Auto-generated method stub
		System.out.println(MobileBill.BRAND_NAME);
        System.out.println(object.findAmount());
	}

	
}

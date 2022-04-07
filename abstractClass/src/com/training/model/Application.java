package com.training.model;
import com.training.model.Insurance;
import com.training.model.VechicleInsurance;
import com.training.model.HealthInsurance;
public class Application {

	
	 public static void printPremium(Insurance object) {
		 System.out.println("premium:=" +object.calculatePremium());
		 
	 }
	public static void main(String[] args) {
		
		VechicleInsurance car = new VechicleInsurance(1010,"ram","car",2019);
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(10,"bhuvi",45);
		printPremium(life);
		String[] illness = {"bp","sugar","ent","thyroid"};
		HealthInsurance health = new HealthInsurance(3030,"vikcy",illness);
		printPremium(health);
		
		
		// TODO Auto-generated method stub

	}

}

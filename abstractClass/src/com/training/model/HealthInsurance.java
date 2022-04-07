package com.training.model;

public class HealthInsurance extends Insurance {
	 
	private String[] preExistingDiseases;

	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePremium() {
		
		 double premium = 10000;
		 for(String eachItem : preExistingDiseases) {
			// String item = eachItem.toLowerCase();
			 if(eachItem.equalsIgnoreCase("BP") || eachItem.equals("sugar")) {
				 premium = 15000;
			 }
		 }
		// TODO Auto-generated method stub
		return premium;
	}

}

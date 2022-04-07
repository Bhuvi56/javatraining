package com.training.model;

public class SavingsAccount extends BankAccount {
	private String nominee;
	// whenever sub class constructor is called its super class

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	
	
//	public SavingsAccount() {
//		super(1020,"ram",5000);
//	System.out.println("constructor of sub class called");
	
	
	
}

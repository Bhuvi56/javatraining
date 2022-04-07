package com.training;

public class BankAccount {
	
    private static int count;
	
	

	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
	}
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	
	//static method
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accountHolderName, double balance,int accountNumber) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static int getCount() {
		return count++;
	}
	//instance method
	public double getUpdatedBalance(double amount) {
		double updateBalance;//local variable
		//System.out.println(updatedBalance);
		double currentBalance =0;
		this.balance = this.balance+amount;
		return this.balance;
		
	}
	 

}

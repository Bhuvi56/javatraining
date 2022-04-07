package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("Ramesh",1000);
		System.out.println(account.getUpdatedBalance(2000));
		System.out.println(account.getAccountHolderName());
		BankAccount account2= new BankAccount("suresh",2000);
		//System.out.println(BankAccount.getCount());
        //System.out.println(BankAccount.getCount());
		System.out.println(account2.getUpdatedBalance(2000));
        System.out.println(account2.getAccountNumber());
        System.out.println("current balance of ramesh:="+account.getUpdatedBalance(3000));
        System.out.println("cureent balance of ramesh:="+account.getUpdatedBalance(4500));
        
        
	}

}
	

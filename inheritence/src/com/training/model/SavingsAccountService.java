package com.training.model;
import com.training.model.SavingsAccount;
import com.training.model.BankAccountServices;
//sub class extends super class
public class SavingsAccountService extends BankAccountServices {
   
	public String getCustomerInfo(SavingsAccount account) {
    	 return account.getAccountHolderName();
    	 
     }

	@Override
	public double calculateInterest(BankAccount account) {
		// TODO Auto-generated method stub
		double simpleInterest = 0.10;
		if(account.getAccountNumber()<=5000) {
			simpleInterest =0.20;
		}
		return account.getBalance()*1*simpleInterest;
			
	
	}
}

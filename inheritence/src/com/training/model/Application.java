package com.training.model;
import com.training.model.SavingsAccount;




public class Application {

	public static void main(String[] args) {
		BankAccount ramsaccount = new BankAccount(1010,"Ramesh",5000,"saving") ;
	       System.out.println(ramsaccount);
		// TODO Auto-generated method stub
		SavingsAccount account = new SavingsAccount(650,"ramesh",670,"joint","rajesh");
		System.out.println(account.getAccountHolderName());
		
		System.out.println(account.getNominee());
		
		System.out.println(account.getBalance());
		
		System.out.println(account.getAccountType());
		 System.out.println(account.getAccountNumber());
		 
		 SavingsAccountService service = new SavingsAccountService();
		
		 System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountServices service2 = new SavingsAccountService();
		SavingsAccountService savingService2 = (SavingsAccountService)service2;
		BankAccountServices sc2 = new SavingsAccountService();
		
		System.out.println(savingService2.getCustomerInfo(account));
	}

}

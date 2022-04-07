package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountServices;
import java.util.*;

		
public class MyApplication{
			public static void main(String[]args) {
				BankAccountServices service = new BankAccountServices();
				BankAccount[] list= new BankAccount[3];
				int idx = 0;
				int choice =0;
				Scanner sc = new Scanner(System.in);
				do {
					
					
					System.out.println("enter the number");

					   int accountNumber = sc.nextInt();
					
					System.out.println("enter the name");

					   String accountHolderName = sc.next();
					
					System.out.println("enter the account type");
					
					   String accountType = sc.next();
					System.out.println("balance");
					    double balance = sc.nextDouble();
					BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
					
					list[idx]=account;
					System.out.println("enter 0 to 1 end continue");
					choice= sc.nextInt();
				}while(choice==1); 
				
				double[] values = service.findInterestByAccountype(list);
				for(double eachValue:values) {
					System.out.println(eachValue);
					
				sc.close();
				}
		}
		// TODO Auto-generated method stub

	}



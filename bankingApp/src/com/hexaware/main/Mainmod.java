package com.hexaware.main;

import java.util.ArrayList;

import com.hexaware.dao.ServiceProviderImpl;
import com.hexaware.dto.Bank;
import com.hexaware.dto.BankAccount;
import com.hexaware.myexception.AccountNumberInvalidException;
import com.hexaware.myexception.InsufficientFundsException;
import com.hexaware.myexception.NegativeAmountException;

public class Mainmod {
	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount("Sachin", "Current",80000.50);
		BankAccount obj2 = new BankAccount("Nisha", "Saving",20000.50);
		BankAccount obj3 = new BankAccount("Roshid", "Current",35000.50);
		
		ArrayList<BankAccount> myList = new ArrayList<>();
		myList.add(obj1);
		myList.add(obj2);
		myList.add(obj3);
		
		Bank myBank = new Bank("ICICI",myList);
		System.out.println("Your Bank name is: "+myBank.bankName+"\n");
		
		ServiceProviderImpl myService = new ServiceProviderImpl(myBank);
		try {
			System.out.println("Balance of 1111: "+ myService.checkbalance(1511));
		} catch (AccountNumberInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n");
		try {
			System.out.println("Balance of 1111: "+ myService.checkbalance(1111)+"\n");
		} catch (AccountNumberInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Depositing 20000.30 to account no 1111: " + myService.deposit(1111, 20000.30)+"\n");
		} catch (AccountNumberInvalidException | NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Withdrawing 20000.30 to account no 1111: " + myService.withdraw(1111, 10000.00)+"\n");
		} catch (AccountNumberInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		BankAccount obj4 = new BankAccount("Rahu", "Current",38000.50);
		System.out.println("Your new account creation status: "+myService.createAccount(obj4)+"\n");
		
		try {
			System.out.println("Your account deletion process for account no "+obj4.getAccountNumber()+" is: "+myService.removeAccount(obj4.getAccountNumber())+"\n");
		} catch (AccountNumberInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

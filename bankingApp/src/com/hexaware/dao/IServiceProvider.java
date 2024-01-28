package com.hexaware.dao;

import com.hexaware.dto.BankAccount;
import com.hexaware.myexception.AccountNumberInvalidException;
import com.hexaware.myexception.InsufficientFundsException;
import com.hexaware.myexception.NegativeAmountException;

public interface IServiceProvider {
	public BankAccount  searchAccount(long accountNumber) throws AccountNumberInvalidException;
	public double checkbalance(long accountNumber) throws AccountNumberInvalidException;
	public boolean deposit(long accountNumber,double amount) throws AccountNumberInvalidException, NegativeAmountException;
	public boolean withdraw(long accountNumber,double amount) throws AccountNumberInvalidException, InsufficientFundsException, NegativeAmountException;
	public boolean removeAccount(long accountNumber) throws AccountNumberInvalidException;
	public boolean createAccount(BankAccount newAcc);
}

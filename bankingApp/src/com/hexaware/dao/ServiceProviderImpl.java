package com.hexaware.dao;

import java.util.logging.*;

import com.hexaware.dto.Bank;
import com.hexaware.dto.BankAccount;
import com.hexaware.myexception.AccountNumberInvalidException;
import com.hexaware.myexception.InsufficientFundsException;
import com.hexaware.myexception.NegativeAmountException;

public class ServiceProviderImpl implements IServiceProvider {
	
	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
    public void sampleLog() { 
        LOGGER.log(Level.INFO, "Your LOGGER is working"); 
    } 


	private Bank myBank;
	 
	public ServiceProviderImpl() {
		super();
	}
 
	public ServiceProviderImpl(Bank myBank) {
		super();
		this.myBank = myBank;
	}
	
	@Override
	public BankAccount  searchAccount(long accountNumber) throws AccountNumberInvalidException {
		LOGGER.log(Level.INFO, "Inside searchAmount with parameter : accountNumber "+accountNumber);
		BankAccount reqAccount=null;
		for(BankAccount account:myBank.getAccountList()) {
			if(account.getAccountNumber()==accountNumber) {
				reqAccount=account;
				break;
			}
		}
		if(reqAccount == null) throw new AccountNumberInvalidException("Invalid account number");
		LOGGER.log(Level.INFO, "exiting search account ");
		return reqAccount;

	}
	@Override
	public double checkbalance(long accountNumber) throws AccountNumberInvalidException  {
		LOGGER.log(Level.INFO, "Inside checkbalance with parameter : accountNumber "+accountNumber);
		// TODO Auto-generated method stub
		double balanceAmount = -1;
		BankAccount reqAccount=null;
		reqAccount=searchAccount(accountNumber);
		if(reqAccount == null) throw new AccountNumberInvalidException("Invalid account number");
		balanceAmount=reqAccount.getBalance();

		LOGGER.log(Level.INFO, "exiting checkbalance ");
		return balanceAmount;
	}
 
	@Override
	public boolean deposit(long accountNumber, double amount) throws AccountNumberInvalidException, NegativeAmountException  {
		// TODO Auto-generated method stub
		LOGGER.log(Level.INFO, "Inside deposit with parameter : accountNumber "+accountNumber+ " and amount: "+amount);
		BankAccount reqAccount=null;
		boolean depostStatus=false;
		if(amount>0) {
			reqAccount=searchAccount(accountNumber);
			if(reqAccount==null){
				throw new AccountNumberInvalidException("Invalid account number");
			}
			else {
				reqAccount.setBalance(reqAccount.getBalance()+amount);
				depostStatus=true;
			}
		}else {
			throw new NegativeAmountException("Balance cannot be negative");
		}

		LOGGER.log(Level.INFO, "exiting deposit ");
		return depostStatus;
	}
 
	@Override
	public boolean withdraw(long accountNumber, double amount) throws AccountNumberInvalidException, InsufficientFundsException, NegativeAmountException  {

		LOGGER.log(Level.INFO, "Inside withdraw with parameter : accountNumber "+accountNumber+ " and amount: "+amount);
		BankAccount reqAccount=null;
		boolean withdrawStatus=false;
		reqAccount=searchAccount(accountNumber);
		if(reqAccount == null) throw new AccountNumberInvalidException("Invalid account number");
		if(reqAccount.getBalance()<amount) {
			throw new InsufficientFundsException("You have insufficient balance");
		}
		if(amount<0) {
			throw new NegativeAmountException("amount cannot be negative");
		}
		else {
			reqAccount.setBalance(reqAccount.getBalance()-amount);
			withdrawStatus=true;
		}
		LOGGER.log(Level.INFO, "exiting deposit ");
		return withdrawStatus;
	}
 
	@Override
	public boolean createAccount(BankAccount newAcc) {
		// TODO Auto-generated method stub
		LOGGER.log(Level.INFO, "Inside createAccount for account no. "+newAcc.getAccountNumber());
		boolean status=false;myBank.getAccountList().add(newAcc);
		if(newAcc != null) status=true;

		LOGGER.log(Level.INFO, "exiting createAccount ");
		return status;
	}
 
	@Override
	public boolean removeAccount(long accountNumber) throws AccountNumberInvalidException  {
		// TODO Auto-generated method stub
		LOGGER.log(Level.INFO, "Inside removeAccount with parameter : accountNumber "+accountNumber);
		BankAccount reqAccount=null;
		boolean removeStatus=false;
		reqAccount=searchAccount(accountNumber);
		if(reqAccount == null) throw new AccountNumberInvalidException("Invalid account number");
		this.myBank.getAccountList().remove(reqAccount);
		removeStatus=true;
		LOGGER.log(Level.INFO, "exiting removeAccount ");
		return removeStatus;
	}

}

package com.hexaware.dto;

import java.util.List;

public class Bank {
	public String bankName;
	public List<BankAccount> accountList;
	
	
	public Bank(String bankName, List<BankAccount> accountList) {
		super();
		this.bankName = bankName;
		this.accountList = accountList;
	}
	

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public List<BankAccount> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<BankAccount> accountList) {
		this.accountList = accountList;
	}
	
}

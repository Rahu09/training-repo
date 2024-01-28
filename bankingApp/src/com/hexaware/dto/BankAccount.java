package com.hexaware.dto;

public class BankAccount {
	
	private long accountNumber;
	private String holderName;
	private String type;
	private double balance;
	private static long generatedAccountNumber=1110;
	
//	public BankAccount(long accountNumber, String accountHolder, String type, double balance) {
//		super();
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//		this.holderName = accountHolder;
//		this.type = type;
//	}
	
	public BankAccount( String accountHolder, String type, double balance) {
		super();
		this.balance = balance;
		this.holderName = accountHolder;
		this.type = type;
		this.accountNumber = generatedAccountNumber++;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String HolderName) {
		this.holderName = HolderName;
	}
}

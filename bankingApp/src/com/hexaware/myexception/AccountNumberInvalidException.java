package com.hexaware.myexception;

public class AccountNumberInvalidException extends Exception {
	public AccountNumberInvalidException(String message){
		super(message);
	}
}

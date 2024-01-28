package com.hexaware.string;

import java.util.Scanner;

public class StringEmailValidator {
	

	public static boolean isValidEmail(String userInput) {
		// TODO Auto-generated method stub
		boolean valid = true;
		
		if(userInput.isEmpty()) valid = false;
		
		if(!userInput.contains("@")) valid = false;
		
		if(!userInput.contains(".")) valid = false;
		
		if(userInput.indexOf('@') > userInput.lastIndexOf('.')) valid = false;
		
		if(userInput.indexOf('@') == 0 || userInput.lastIndexOf('.') == userInput.length() - 1) valid = false;
		
		return valid;
	}
}

package com.hexaware.main;

import java.util.Map;
import java.util.Scanner;

import com.hexaware.string.StringBuilderClass;
import com.hexaware.string.StringEmailValidator;
import com.hexaware.string.StringSearchEngine;
import com.hexaware.string.URLBuilder;
import com.hexaware.string.URLParser;

public class mainmod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilderClass sb = new StringBuilderClass("testing");
		
		sb.toString();
		sb.append("111");
		sb.toString();
		sb.delete(2, 4);
		sb.toString();
		sb.insert("hii", 5);
		sb.toString();
		
		//-------------------------------------------------------------------------
		
		String userInput = sc.next();
		
		boolean isValid = StringEmailValidator.isValidEmail(userInput);
		
		if(isValid) System.out.println("email is valid");
		else System.out.println("email is invalid");
//		-------------------------------------------------------------------------
		
		StringSearchEngine st = new StringSearchEngine("what is your is the name is the");
		System.out.println(st.findAllOccurrence("is"));

		st.highlightOccurrences("is");
//		---------------------------------------------------------------------------------------
		
		URLParser urlParser = new URLParser("https://www.example.com/path/to/resource?param1=value1&param2=value2");
		System.out.println(urlParser.toString());
//		-----------------------------------------------------------------------------------------

        String protocol = "https";
        String host = "www.example.com";
        String path = "/path/to/resource";
        Map<String, String> queryParams = Map.of("param1", "value1", "param2", "value2");
        
		URLBuilder urlBuilder = new URLBuilder(protocol, host, path, queryParams);
		
		System.out.println(urlBuilder.build());
		
		sc.close();
	}
	
}

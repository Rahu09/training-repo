package com.hexaware.example;

import java.util.*;

public class ReversePrime {
	public static void main(String[] args) {
		System.out.println(primeExtract(257891).toString());
	}
	public static String[] primeExtract(int n) {
		ArrayList<String> ans = new ArrayList<>();
		while(n!=0) {
			int temp = n%10;
			boolean prime = isPrime(temp);
			
			if(prime) {
				switch(temp) {
					case 2:
						ans.add("Two");
						break;
					case 3:
						ans.add("Three");
						break;
					case 5:
						ans.add("Five");
						break;
					case 7:
						ans.add("Seven");
						break;
				}
			}
			n=n/10;
		}
		String[] result = new String[ans.size()];
		for(int i=0; i<ans.size(); i++) {
			result[i] = ans.get(i);
		}
		return result;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) 
            return false; 
   
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
	}
	
}

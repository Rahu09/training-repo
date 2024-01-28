package com.hexaware.string;

import java.util.ArrayList;
import java.util.List;

public class StringSearchEngine {
	private String string;
	
	private String pattern;
	
	public StringSearchEngine(String string) {

		this.string = string;
	}
	
	public List<Integer> findAllOccurrence(String pattern) {
		
		
		List<Integer> occurrence = new ArrayList<>();
		
		if(string == null || pattern.isEmpty()) return occurrence;
		
		int indexOfOccurrence = string.indexOf(pattern);
		
		while(indexOfOccurrence != -1) {
			occurrence.add(indexOfOccurrence);
			indexOfOccurrence = string.indexOf(pattern, indexOfOccurrence+1);
		}
		
		return occurrence;
	}
	
	public void highlightOccurrences(String pattern) {
		List<Integer> occurrence = findAllOccurrence(pattern);
		
		String blueBackground = "\u001B[48;5;12m";
		
		for(int i=0;i<occurrence.size(); i++) {
			int index = occurrence.get(i);
			int start = i == 0 ? 0 : occurrence.get(i-1)+pattern.length();
			
			System.out.print(string.substring(start,index));
			System.out.print(blueBackground + string.substring(index,index+pattern.length()) + "\u001B[0m");
			
			if(i == occurrence.size()-1) System.out.print(string.substring(index+pattern.length()));
		}
		System.out.println();
	}
	
}

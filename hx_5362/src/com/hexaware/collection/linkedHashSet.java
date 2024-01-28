package com.hexaware.collection;

import java.util.*;

public class linkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<String>  s= new LinkedHashSet<>();
	s.add("mango");
	s.add("grape");
	s.add("orange");
	s.add("apple");
	s.add("grapes");
	
	Iterator<String> i = s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}

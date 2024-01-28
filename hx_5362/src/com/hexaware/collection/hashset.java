package com.hexaware.collection;

import java.util.*;

public class hashset {
public static void main(String[] args) {
	Set<String> s = new HashSet<>();
	s.add("java");
	s.add("python");
	s.add("aws");
	s.add("node");
	s.add("react");
	s.add("java");
	
	Iterator<String> i = s.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}

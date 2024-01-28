package com.hexaware.collection;

import java.util.*;

public class list_arrayList {
public static void main(String[] args) {
	ArrayList<String> s = new ArrayList<>();
	s.add("java");
	s.add("java");
	s.add("python");
	s.add("aws");
	s.add("node");
	s.add("react");
	s.remove("aws");
	
	Iterator i = s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}

package com.hexaware.collection;

import java.util.*;

public class treeset {
public static void main(String[] args) {
	//example - 1
	Set<String> s = new TreeSet<>();
	s.add("java");
	s.add("java");
	s.add("python");
	s.add("aws");
	s.add("node");
	s.add("react");
	s.remove("aws");
	
	// no null accepted
//	s.add(null);
	s.add("java");
	
	Iterator<String> i = s.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("enhasend for lo0p...");
	for(String ele:s) System.out.println(ele);
	
	// example - 2
	TreeSet<Integer> s2 = new TreeSet<Integer>();
	s2.add(0);
	s2.add(5);
	s2.add(10);
	s2.add(15);
	s2.add(20);
	s2.add(25);
	s2.add(30);

	System.out.println("poll example " + s2);
	System.out.println("pollFirst " + s2.pollFirst());
	System.out.println("pollLast " + s2.pollLast());
	System.out.println("descendingSet " + s2.descendingSet());
	
	// example - 3
	TreeSet<String> s3 = new TreeSet<String>();
	s3.add("y");
	s3.add("a");
	s3.add("d");
	s3.add("a");
	s3.add("v");
	
	System.out.println("headset and tailset example ");
	System.out.println(s3);
	System.out.println("headSet d " + s3.headSet("d"));
	System.out.println("tailSet a " + s3.tailSet("a"));
	System.out.println("subset" + s3.subSet("b", "d"));
}
}

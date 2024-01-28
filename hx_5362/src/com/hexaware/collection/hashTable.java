package com.hexaware.collection;

import java.util.*;

public class hashTable {
	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<>();
		h.put(1, "mango");
		h.put(2, "grapes");
		h.put(3, "orange");
		h.put(4, "lemon");
		h.put(5, "apple");
		
		for(Map.Entry m : h.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}
}

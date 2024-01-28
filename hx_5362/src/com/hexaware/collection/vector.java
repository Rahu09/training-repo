package com.hexaware.collection;

import java.util.*;

public class vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("blue");
		v.add("red");
		v.add("black");
		v.add("green");
		v.add("blue");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}

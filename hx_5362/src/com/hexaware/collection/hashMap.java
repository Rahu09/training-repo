package com.hexaware.collection;

import java.util.*;

public class hashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1,"hari");
		h.put(2,"neel");
		h.put(3,"komal");
		h.put(4,"tej");
		h.put(5,"ravi");
		for(Map.Entry m:h.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println("After modification.........");
		HashMap<Integer,String> h2 = new HashMap<Integer, String>();
		h2.put(55,"moni");
		h2.put(66,"balu");
		h2.put(77,"walsh");
		h2.putAll(h);
		for(Map.Entry m:h2.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		}
}

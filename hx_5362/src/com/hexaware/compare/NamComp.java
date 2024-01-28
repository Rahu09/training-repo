package com.hexaware.compare;

import java.util.Comparator;

public class NamComp implements Comparator {
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.eName.compareTo(e2.eName);
	}
}

package com.hexaware.compare;

import java.util.Comparator;

public class SalComp implements Comparator {
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		if(e1.sal==e2.sal) return 0;
		else if(e1.sal > e2.sal) return 1;
		else return -1;
		
	}
}

package com.hexaware.compare;

public class Emp implements Comparable<Emp> {
	int eid;
	String eName;
	int sal;
	public Emp(int eid, String eName, int sal) {
		this.eid = eid;
		this.eName = eName;
		this.sal = sal;
	}
	public int compareTo(Emp o) {
		if(sal ==o.sal) return 0;
		else if(sal > o.sal) return 1;
		else return -1;
	}
}

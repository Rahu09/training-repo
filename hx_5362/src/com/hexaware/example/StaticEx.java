package com.hexaware.example;

public class StaticEx {
	
	int eid;
	String eName;
	static String org="ABC";
	
	public StaticEx(int eid, String eName) {
		this.eid = eid;
		this.eName = eName;
	}
	
	static void chg() {
		org="hexa";
	}
	
	void show() {
		System.out.println(eid+ " "+ eName+" "+org);
	}
	
	
public static void main(String[] args) {
	
	StaticEx a = new StaticEx(10,"now");
	
	chg();
	a.show();
}
static {
	System.out.println("auth done");
}
}

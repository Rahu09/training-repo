package com.hexaware.oops;

public class A {
public static void main(String[] args) {
	Emp e = new Emp();
	e.setEid(0);
	e.seteName("rahul");
	e.setSal(25000);
	
	System.out.println(e.getEid());
	System.out.println(e.geteName());
	System.out.println(e.getSal());
}
}

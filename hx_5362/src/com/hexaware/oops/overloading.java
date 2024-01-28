package com.hexaware.oops;

public class overloading {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add(float i, int j) {
		return i+j;
	}
	float add(int i, float j) {
		return i+j;
	}
	
public static void main(String[] args) {
	overloading ob = new overloading();
	
	System.out.println(ob.add(1,2));
	System.out.println(ob.add(2,2));
	System.out.println(ob.add(1,2,3));
	System.out.println(ob.add(1,2));

}
}

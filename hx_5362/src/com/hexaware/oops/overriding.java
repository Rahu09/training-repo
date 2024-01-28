package com.hexaware.oops;


public class overriding {
	
	class A{
		void m1() {
			System.out.println("I am an A method m1");
		}
	}
	
	class B extends A {
		void m1() {
			System.out.println("I am an A method m1 in B");
		}
		void m2() {
			System.out.println("I am an B method m2");
		}
	}
	
	public static void main(String[] args) {
		overriding instance = new overriding();
		overriding.B ob = instance.new B();
		ob.m1();
		ob.m2();
	}
}

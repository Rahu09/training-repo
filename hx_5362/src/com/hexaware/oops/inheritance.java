package com.hexaware.oops;

public class inheritance {
	
	class A{
		void m1() {
			System.out.println("I am in A");
		}
	}
	
	class B extends A {
		void m2() {
			System.out.println("I am in B");
		}
	}
		
	class C extends B implements D,E{
		public void m3() {
			System.out.println("I am from interface D");
		}
		public void m4() {
			System.out.println("I am from interface E");
		}
		void m5() {
			System.out.println("I am in C");
		}
	}
	
public static void main(String[] args) {
	inheritance in = new inheritance();
	inheritance.C c = in.new C();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	c.m5();
}
}

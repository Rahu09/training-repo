package com.hexaware.collection;

import java.util.*;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println("stack; "+s);
		pushEle(s,0);
		pushEle(s,3);
		pushEle(s,6);
		pushEle(s,8);
		pushEle(s,33);
		pushEle(s,66);
		pushEle(s,34);
		pushEle(s,54);
		pushEle(s,83);
		
		try {
			popEle(s);
			popEle(s);
		}catch(Exception e) {
			System.out.println("Empty stack"+e);
		}
	}
	static void pushEle(Stack<Integer> stk, int p) {
		stk.push(p);
		System.out.println("push=>"+p);
		System.out.println("stack:"+stk);
	}
	static void popEle(Stack<Integer> stk) {
		Integer p = (Integer) stk.pop();
		System.out.println("pop=> "+p);
		System.out.println("stack:"+stk);
	}
}

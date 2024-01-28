package com.hexaware.string;

public class StringBuilderClass {
	private String string;
	
	public StringBuilderClass(String string){
		this.string = string;
	}
	
	public void append(String st) {
		this.string=this.string+st;
	}
	
	@Override
	public String toString() {
		System.out.println(string);
		return string ;
	}

	public boolean insert(String st, int index) {
		
		boolean inserted = true;
		if(index<0 || index >= this.string.length()) inserted = false;
		
		this.string = this.string.substring(0,index) + st + this.string.substring(index);
		return inserted;
	}
	
	public boolean delete(int start, int end) {
		
		boolean inserted = true;
		if(start<0 || start >= this.string.length() || end<0 || end >= this.string.length() || start>=end) inserted = false;
		
		this.string = this.string.substring(0,start) + this.string.substring(end);
		return inserted;
	}
}

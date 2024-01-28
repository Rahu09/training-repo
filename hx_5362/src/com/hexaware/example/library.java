package com.hexaware.example;

import java.util.*;

public class library {
	ArrayList<books> bookList = new ArrayList<>();
	
	library(ArrayList<books> bookList){
		this.bookList = bookList;
	}
	
	library(){}
	
	public void addBook(books book) {
		this.bookList.add(book);
		System.out.println(book + "book added");
	}
	public void displayBook() {
		for(books book: bookList) {
			System.out.println(book.getTitle());
		}
	}
}

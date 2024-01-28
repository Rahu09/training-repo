package com.hexaware.example;

public class books {
	String title;
	String author;
	int copiesAvailable;
	
	books(String title, String author, int copiesAvailable){
		this.title = title;
		this.author = author;
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}
	
	public void lendBook() {
		if(copiesAvailable>0) {
			copiesAvailable-=1;
			System.out.println("Books issued sucessfully");
		}else {
			System.out.println("Books not available");
		}
	}
	public void returnBook() {
		copiesAvailable+=1;
		System.out.println("book returned sucessfully");
	}
}

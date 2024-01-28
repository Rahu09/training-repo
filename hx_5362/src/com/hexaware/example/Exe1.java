package com.hexaware.example;

public class Exe1 {
	public static void main(String[] args) {
		library lib = new library();
		
		books book1 = new books("42 Laws Of Power", "james dean", 10);
		books book2 = new books("alchimist", "pablo calheo", 10);
		books book3 = new books("solo leveling", "jee gab san", 10);
		books book4 = new books("overgeared", "soo ruk", 10);
		
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		lib.addBook(book4);
		
		lib.displayBook();
		
		book1.lendBook();
		book1.getCopiesAvailable();
		book1.returnBook();
		book1.getCopiesAvailable();
	}
}

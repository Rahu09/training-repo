package com.hexaware.example;

import java.util.Scanner;

import com.hexaware.non_main.SI_CI;

public class Calculate_SI_CI {
public static void main(String[] args) {
//	SI_CI ob=new SI_CI();
//	
//	Scanner sc = new Scanner(System.in);
//	
//	double p= sc.nextDouble();
//    double r=sc.nextDouble();
//    double t=sc.nextDouble();
//    
//    System.out.println("The Simple Interest calculated is: "+ob.CalSI(p,r,t));
//    System.out.println("The Compound Interest calculated is: "+ob.CalCI(p,r,t));
//    sc.close();
	
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

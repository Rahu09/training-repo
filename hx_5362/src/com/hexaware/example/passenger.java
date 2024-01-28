package com.hexaware.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class passenger {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hexa","root","Rulerahul@08");
		run(con);
	}
	public static void run(Connection con) throws Exception {
		
		// config----------------
		double ladiesKota = 14.7;
		double siniorKota = 10;
		int totalTicket = 100;
		int fare = 200;
		//----------------------
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("*********************************************");
			System.out.println("*********************************************");
			System.out.println("Select from the given options");
			System.out.println("1. book Tickets");
			System.out.println("2. Exit");
			System.out.println("*********************************************");
			System.out.println("*********************************************");
			System.out.println();
			int exit = sc.nextInt();
			sc.nextLine();
			if(exit == 2) {
				System.out.println("Exiting the system");
				System.exit(0);
			}
			
			System.out.println("enter customer name: ");
			String name = sc.nextLine();
			
			System.out.println("select your gender: ");
			System.out.println("1. male");
			System.out.println("2. female");
			int gen = sc.nextInt();
			sc.nextLine();
			String gender = (gen == 1) ? "male":"female";
			String dob = "";
			
			boolean ticCheck = true;
			int noTickets = 0;
			int availTickets = 0;
			while(ticCheck) {
				System.out.println("enter the no of tickets you require");
				noTickets = sc.nextInt();
				sc.nextLine();
				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select sum(no_tickets) from passenger");
				
				while(rs.next()) {
					availTickets =  totalTicket -  rs.getInt(1);
				}
//				System.out.println(availTickets);
				if(availTickets<noTickets) {
					System.out.println("only "+availTickets+ " are available. please enter again.");
				}else {
					ticCheck = false;
				}
			}
			System.out.println("available tickets: "+availTickets);
			
			
			boolean dobCheck = true;
			while(dobCheck) {
				System.out.println("enter your dob in format of yyyy-mm-dd");
				dob = sc.nextLine();
				
				String[] check = dob.split("-");
				boolean c1 = ((check[0].length() == 4) ? true:false) && ((check[1].length() == 2) ? true:false) && ((check[2].length() == 2) ? true:false);
				boolean c2 = ((Integer.parseInt(check[0]) >1900 && Integer.parseInt(check[0]) <2024 ) ? true:false) && ((Integer.parseInt(check[1]) >0 && Integer.parseInt(check[1]) <13 ) ? true:false) && ((Integer.parseInt(check[2]) >0 && Integer.parseInt(check[2]) <32 ) ? true:false);
				dobCheck = (c1 && c2) ? false : true;
				if(dobCheck == true) System.out.println("you have the worng dob of in wrong format please re enter");
				else System.out.println("all info added");
			}
//			System.out.println(name + gender + dob + noTickets);
			
			PreparedStatement ps = con.prepareStatement("insert into passenger (pname,dob,gender, no_tickets) value(?,?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, dob);
			ps.setString(3, gender);
			ps.setInt(4, noTickets);

			int c = ps.executeUpdate();
			System.out.println(c+" record updated");
			System.out.println();
			double price = fare*noTickets;
			
			if(availTickets < totalTicket*(75/100) ) {
				price = price*(1+(32/100));
			}else if(availTickets < totalTicket*(50/100)) {
				price = price*(1+(18/100));
			}
			
			price = (gender == "female") ? price*(1-(ladiesKota/100)) : price;
			price = ((2023 - Integer.parseInt(dob.split("-")[1])) > 68) ? price*(1-(ladiesKota/100)) : price;
			double discount =  0;
			
			if(gender=="female")discount += price*((ladiesKota/100));
			if((2024-(Integer.parseInt(dob.split("-")[0]))) > 68) discount+=price*((siniorKota/100));
			System.out.println("your age is "+(2024-(Integer.parseInt(dob.split("-")[0]))));
			
			System.out.println("Your total DISCOUNT is of "+ discount+" rupees");
			System.out.println("your Total Fare is of "+price+" rupees");
			System.out.println();
		}
	}
}

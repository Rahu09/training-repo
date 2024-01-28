package com.hexaware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_test {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hexa","root","Rulerahul@08");
		
		create(con);
		select(con);
		update(con);
		delete(con);
		
		con.close();
	}
	
	public static void delete(Connection con) throws Exception {
		//---------delete statement
		PreparedStatement ps = con.prepareStatement("delete from customer where cid=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter cid");
		int cid = sc.nextInt();
		
		ps.setInt(1, cid);

		int c = ps.executeUpdate();
		System.out.println(c+" record updated");
	}
	
	public static void update(Connection con) throws Exception {
		//--------update statement
		PreparedStatement ps = con.prepareStatement("update customer set cname=? where cid=?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter cid");
		int cid = sc.nextInt();
		
		System.out.println("enter cname");
		String cName = sc.next();
		
		ps.setInt(2, cid);
		ps.setString(1, cName);
		
		int c = ps.executeUpdate();
		System.out.println(c+" record updated");
	}
	
	public static void create(Connection con) throws Exception {
		//---------create statement
		PreparedStatement ps = con.prepareStatement("insert into customer value(?,?,?)");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter cid");
		int cid = sc.nextInt();
		
		System.out.println("enter cname");
		String cName = sc.next();
		
		System.out.println("enter hobby");
		String hobby = sc.next();
		
		ps.setInt(1, cid);
		ps.setString(2, cName);
		ps.setString(3, hobby);

		int c = ps.executeUpdate();
		System.out.println(c+" record updated");
	}
	
	public static void select(Connection con) throws Exception {
		//---------read statement
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
}

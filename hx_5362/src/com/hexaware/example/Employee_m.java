package com.hexaware.example;

import java.util.Scanner;

import com.hexaware.non_main.Employee_nm;

public class Employee_m {
public static void main(String[] args) {
	 Employee_nm ob=new Employee_nm();
	 
	 Scanner sc = new Scanner(System.in);
	 
	   String name=sc.next();
	   String id=sc.next();;
	   int basic=sc.nextInt();
	   float ta=ob.ta(basic);
	   float da=ob.da(basic);
	   float hra=ob.hra(basic);
	   float gross=ob.gross(basic, hra, da, ta);
	   System.out.println("Employee Name is: "+name);
	   System.out.println("Employee Id is: "+id);
	   System.out.println("Employee hra is: "+hra);
	   System.out.println("Employee ta is: "+ta);
	   System.out.println("Employee da is: "+da);
	   System.out.println("Employee gross is: "+gross);
	   ob.show(gross);

}
}

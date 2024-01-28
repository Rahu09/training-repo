package com.hexaware.example;


import java.util.Scanner;

import com.hexaware.non_main.Student_nm;

public class Student_m {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Student_nm ob=new Student_nm();
	String name=sc.next();
	String id=sc.next();
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	System.out.println("The name of student is: "+name);
	System.out.println("The id of student is: "+id);
    System.out.println("the total marks of student is: "+ob.total(m1,m2,m3));
    System.out.println("the average marks of student is: "+ob.avg(m1,m2,m3));
    float average=ob.avg(m1,m2,m3);
    ob.show(average);

}
}

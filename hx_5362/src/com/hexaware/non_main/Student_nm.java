package com.hexaware.non_main;

public class Student_nm {
	public int total(int m1,int m2,int m3)
	{
	      return m1+m2+m3;
	}
	public float avg(int m1,int m2,int m3)
	{
	    return (m1+m2+m3)/3;
	}
	public void show(float average)
	{
	 if(average>=60)
	    {
	       System.out.println("1st class");
	    }
	    else if(average>=50 && average<60)
	    {
	       System.out.println("2nd class");
	    }
	    else if(average>=35 && average<50)
	    {
	       System.out.println("3rd class");
	     }
	}

}

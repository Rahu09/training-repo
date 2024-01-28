package com.hexaware.non_main;

public class Employee_nm {
	public float ta(int basic)
	{
	    return (basic*5)/100;
	}
	public float da(int basic)
	{
	    return (basic*8)/100;
	}
	public float hra(int basic)
	{
	    return (basic*12)/100;
	}
	public float gross(int basic,float hra,float da,float ta)
	{
		return basic+hra+ta+da;
	}
	public void show(float gross)
	{
	  if(gross>=25000)
	      System.out.println("A grade");
	  else if(gross<25000)
	      System.out.println("B grade");
	}

}

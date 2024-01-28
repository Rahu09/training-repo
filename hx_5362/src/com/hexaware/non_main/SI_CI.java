package com.hexaware.non_main;

public class SI_CI 
{
	public double CalSI(double p,double r,double t)
	{
	     return (p*r*t)/100;
	}
	public double CalCI(double p,double r,double t)
	{
	     double A = p *(Math.pow((1 + r / 100), t)); 
	     double CI = A - p; 
	    return CI;
	}

}
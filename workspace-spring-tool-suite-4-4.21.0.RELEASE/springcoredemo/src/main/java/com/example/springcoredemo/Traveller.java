package com.example.springcoredemo;

public class Traveller {
	
	private Vehicle Obj = null;

	public Traveller(Vehicle Obj) {
		super();
		this.Obj = Obj;
	}
	
	public void startJourney() {
		this.Obj.move();
	}
}

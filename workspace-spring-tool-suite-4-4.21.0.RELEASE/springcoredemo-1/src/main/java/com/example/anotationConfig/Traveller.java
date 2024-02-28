package com.example.anotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Traveller")
public class Traveller {
	
	private Vehicle Obj = null;

	@Autowired
	public Traveller(@Qualifier("Bike") Vehicle Obj) {
		super();
		this.Obj = Obj;
	}
	
	public void startJourney() {
		this.Obj.move();
	}
}

package com.example.anotationConfig;

import org.springframework.stereotype.Component;

@Component("Cycle")
public class Cycle implements Vehicle {
	
	public void move() {
		System.out.println("cycle is moving");
	}
}

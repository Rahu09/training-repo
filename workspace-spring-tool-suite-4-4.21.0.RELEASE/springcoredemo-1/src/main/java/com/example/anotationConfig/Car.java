package com.example.anotationConfig;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements Vehicle {
	
	public void move() {
		System.out.println("car is moving");
	}
}

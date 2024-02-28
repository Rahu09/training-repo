package com.example.anotationConfig;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Bike")
//@Primary
public class Bike implements Vehicle {
	
	@Override
	public void move() {
		System.out.println("bike is moving");
	}
}

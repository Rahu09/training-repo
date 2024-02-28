package com.example.springcoredemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


public class Client {
	
	public static void main(String[] args) {
		
//		Traveller obj = new Traveller(new Bike());
//		
//		obj.startJourney();
		
		// Spring IOC container supplied with java based configuration
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car obj = applicationContext.getBean(Car.class);
		obj.move();
		
	}
}

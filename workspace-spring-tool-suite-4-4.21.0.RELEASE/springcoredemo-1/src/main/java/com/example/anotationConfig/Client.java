package com.example.anotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


public class Client {
	
	public static void main(String[] args) {
		
		// Spring IOC container supplied with java based configuration
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Car obj = applicationContext.getBean(Car.class);
//		obj.move();
//		
		Traveller obj1 = applicationContext.getBean(Traveller.class);
		obj1.startJourney();
		
	}
}

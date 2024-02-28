package com.example.AnotationBasedDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		
		//Sending email
		messageSender.sendMessage("this is my mail", "email");
		
		//sending msz
		messageSender.sendMessage("this is my sms", "sms");
	}
}

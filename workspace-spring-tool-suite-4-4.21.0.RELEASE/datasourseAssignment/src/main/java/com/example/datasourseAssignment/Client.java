package com.example.datasourseAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmailService emailService = applicationContext.getBean(EmailService.class);
		emailService.sendEmail();
		
		((ConfigurableApplicationContext)applicationContext).close();
	}
}
;
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
      
      
      Employee employee = (Employee) applicationContext.getBean("employee");
      System.out.println(employee);
      
      MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		
		//Sending email
		messageSender.sendMessage("this is my mail", "email");
		
		//sending msz
		messageSender.sendMessage("this is my sms", "sms");
   }
}
package com.example.AnotationBasedDI;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}

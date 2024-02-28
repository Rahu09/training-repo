package com.tutorialspoint;

public class SmsService implements MessageService{
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}

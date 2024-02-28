package com.example.datasourseAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	private Datasource datasource;
	
	@Autowired
	public EmailService(Datasource datasource){
		this.datasource = datasource;
	}
	
	
	public void sendEmail() {
		datasource.returnConnection();
	}
}

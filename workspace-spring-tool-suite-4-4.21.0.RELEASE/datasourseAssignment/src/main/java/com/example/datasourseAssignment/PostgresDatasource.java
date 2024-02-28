package com.example.datasourseAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresDatasource implements Datasource {

	@Override
	public void returnConnection() {
		// TODO Auto-generated method stub
		System.out.println("postgres connected");
		System.out.println("email sent");
	}

}

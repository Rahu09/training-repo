package com.example.datasourseAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MysqlDatasource implements Datasource {

	@Override
	public void returnConnection() {
		// TODO Auto-generated method stub
		System.out.println("mysql connected");
		System.out.println("email sent");
	}

}

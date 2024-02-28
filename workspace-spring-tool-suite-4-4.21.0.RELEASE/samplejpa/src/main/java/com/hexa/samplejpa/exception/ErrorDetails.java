package com.hexa.samplejpa.exception;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

public class ErrorDetails {
	private LocalDateTime timeStamp;
	private String message;
	private String path;
	private String errorCode;

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDetails(LocalDateTime timeStamp, String message, String path, String errorCode) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.path = path;
		this.errorCode = errorCode;
	}
	
}
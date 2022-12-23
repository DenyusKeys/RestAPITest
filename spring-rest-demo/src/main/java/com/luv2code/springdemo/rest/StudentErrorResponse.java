package com.luv2code.springdemo.rest;
// This class is sent back tot he client as JSON

public class StudentErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;
	
	
	//Constructors
	public StudentErrorResponse () {
		
	}

	public StudentErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	};
	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}

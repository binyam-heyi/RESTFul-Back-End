package com.webservices.restfulwebservices.exceptions;

import java.util.Date;


public class ExceptionResponse {
	//timestamp
	//exception Message
	//detail
	private Date timestamp;
	private String messsage;
	private String details;
	public ExceptionResponse(Date timestamp, String messsage, String details) {
		super();
		this.timestamp = timestamp;
		this.messsage = messsage;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMesssage() {
		return messsage;
	}
	public String getDetails() {
		return details;
	}
	
	
	
	

}

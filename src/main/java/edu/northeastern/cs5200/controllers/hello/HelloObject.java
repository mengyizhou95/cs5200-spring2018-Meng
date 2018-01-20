package edu.northeastern.cs5200.controllers.hello;

public class HelloObject {
	
	private String message;//private here 
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloObject(String message) {
		this.message = message;
	}
	public HelloObject() { //constructor
	}
}


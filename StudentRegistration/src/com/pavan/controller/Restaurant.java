package com.pavan.controller;

public class Restaurant {

	private String greetStudent;
		
	
	
	public void setGreetStudent(String greetStudent) {
		this.greetStudent = greetStudent;
	}



	public String greet()
	{
		System.out.println(greetStudent);
		return greetStudent;
	}
}

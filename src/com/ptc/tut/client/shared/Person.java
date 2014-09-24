package com.ptc.tut.client.shared;

public class Person {
	
	private String lastName;
	private String firstName;
	
	public Person() { 
		this("Shantanu", "Singhal");
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
}

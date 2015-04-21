package com.warrior.minds;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	
	// Getter and setter methods. Methods used to read or modify
	// the member variables of this class.
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}

package com.warrior.minds;

import java.util.Date;

// class declaration: access-modifier class ClassName
public class Person {
	// Member variables. The scope of these variables is the entire class.
	// Any method in the class can have access to them. 
	// Since they are private, they can only be accessed within this class.
	private String firstName;
	private String lastName;
	private int age;
	private Date birthday;
	private String gender;
	
	// Default constructor, no need to add it if you are not going to do anything
	// at object initialization.
	// this("calling another constructor") will call the constructor that receives
	// a string value.
	public Person(){
		this("Calling another constructor");
		firstName = "John";
		lastName = "Doe";
		age = 0;
		birthday = new Date();
		gender = "Male";		
	}
	
	// Constructor that receives different values to initialize the variables in this object.
	// Note the this keyword. It is referring to the current instance of the class.
	// So what these lines do is assign the received value to the current object instance
	// variable.
	public Person(String firstName, String lastName, int age, Date birthday, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthday = birthday;
		this.gender = gender;
		System.out.println("Person object initialized.");
	}
	
	public Person(String message){
		System.out.println(message);
	}
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Behavior for the Person object. All the objects
	// created from this class will have access to these methods.
	// you can add here whatever your class needs to do.
	public void wakeUp(){
		System.out.println(firstName + " is waking up...");
	}
	
	public void goToWork(){
		System.out.println(firstName + " is going to work...");
	}
	
	public void sayMyName(){
		System.out.println("My name is " + firstName + " " + lastName);
	}

}

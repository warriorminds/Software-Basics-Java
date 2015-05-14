package com.warrior.minds;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// Object creation. You are instantiating your Person class here.
		// Each object is different, but share the same template class.
		Person personOne = new Person();
		Person personTwo = new Person("George", "Harrison", 52, new Date(1943, 2,
				25), "Male");

		// Use Person methods. You will have unique values for personOne.
		// Since we used the empty constructor, you will see here the default
		// values.
		System.out.println("Person One methods: ");
		personOne.wakeUp();
		personOne.goToWork();
		personOne.sayMyName();

		System.out.println();
		// Use Person methods. You will have unique values for personOne.
		// Since we used the empty constructor, you will see here the default
		// values.
		System.out.println("Person Two methods: ");
		personTwo.wakeUp();
		personTwo.goToWork();
		personTwo.sayMyName();
		
		System.out.println();
		// Using setter methods. We are going to change personOne's values
		// using the setter methods that are available in the Person class.
		personOne.setAge(72);
		personOne.setBirthday(new Date(1942, 05, 18));
		personOne.setFirstName("Paul");
		personOne.setLastName("McCartney");
		
		// Using getter methods. Show the new values for personOne
		System.out.println(personOne.getFirstName() + " " + personOne.getLastName());
		System.out.println("age: " + personOne.getAge());
		System.out.println("Birthday: " + personOne.getBirthday().toString());
		
	}

}

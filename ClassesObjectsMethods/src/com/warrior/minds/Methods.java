package com.warrior.minds;

public class Methods {

	public static void main(String[] args) {
		// Call a method that returns a value.
		int result = add();
		System.out.println("The result of the add() method is " + result);
		System.out.println();

		// Call a method that does not return a value.
		printResult(result);

		// Calling an overloaded method.
		result = add(6, 9);
		printResult(result);

		// Calling an overloaded method with variable parameter list.
		result = add(50, 6, 0, 12, 3);
		printResult(result);
		
		result = add(1, 2, 3);
		printResult(result);
		
		// Calling another overloaded method.
		double doubleResult = add(6.0, 5.4);
	
		System.out.println();
		
		// Passing parameters by value
		int valueToPass = 10;
		System.out.println("Original value to pass: " + valueToPass);
		System.out.println("Calling method...");
		modifyingByValue(valueToPass);
		System.out.println("Variable value after method: " + valueToPass);
		
		System.out.println();
		
		// Passing parameters by reference. You can see that if you
		// modify a value of your object in the method, you will
		// modify also the original object value!
		Person objectToPassAsReference = new Person();
		objectToPassAsReference.setFirstName("John");
		objectToPassAsReference.setLastName("Lennon");
		System.out.println("Person name:" + objectToPassAsReference.toString());
		System.out.println("Calling method...");
		modifyingByReference(objectToPassAsReference);
		System.out.println("Person variable name after method: " + objectToPassAsReference.toString());
	}

	// Method that returns the addition of 1 + 2.
	// The return type is int and it is declared as
	// public. This means this method can be called
	// from any class.
	// Also, it does not require parameters.
	public static int add() {
		int result = 1 + 2;
		return result;
	}

	// Method that adds two values, that are passed as parameters. 
	// This is a method overloading since previously you have a method
	// with the same name but no parameters.
	public static int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}

	// Another overloaded method, this time with a variable
	// list of parameters.
	public static int add(int... parameters) {
		int result = 0;
		for (int i = 0; i < parameters.length; i++) {
			result = result + parameters[i];
		}
		return result;
	}

	// Another overloaded method. This time it adds two doubles.
	public static double add(double valueOne, double valueTwo){
		return valueOne + valueTwo;
	}
	
	// Method that does not return a result.
	public static void printResult(int result) {
		System.out.println("The result is " + result);
	}

	// Method that modifies a parameter passed by value.
	public static void modifyingByValue(int value){
		System.out.println("Received parameter value: " + value);
		value = 0;
		System.out.println("Set received parameter to zero: " + value);
	}
	
	// Method that modifies a parameter passed by reference.
	// This method receives a copy of a Person object and 
	// modifies a value of this object. 
	public static void modifyingByReference(Person person){
		System.out.println("Received person name: " + person.toString());
		person.setFirstName("George");
		System.out.println("Modified person name in method variable");
	}
}

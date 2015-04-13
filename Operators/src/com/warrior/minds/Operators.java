package com.warrior.minds;

public class Operators {

	public static void main(String[] args) {
		// Assignment operator
		int firstValue = 8;
		int secondValue = 24;
		
		System.out.println("========== Arithmetic operators ==========");
		/* Arithmetic operators */
		int result = 0;
		
		result = firstValue + secondValue;
		System.out.println("Addition operator result: " + result);
		
		result = secondValue - firstValue;
		System.out.println("Subtraction operator result: " + result);
		
		result = firstValue * secondValue;
		System.out.println("Multiplication operator result: " + result);
		
		result = secondValue / firstValue;
		System.out.println("Division operator result: " + result);
		
		// Break line
		System.out.println();
		
		System.out.println("========== String Concatenation ==========");
		// Arithmetic operator - Strings
		String firstString = "This is ";
		String secondString = "a good day.";
		String stringResult = firstString + secondString;
		System.out.println("String concatenation: " + stringResult);
		
		// Break line
		System.out.println();
		
		System.out.println("========== Remainder/Modulus ==========");
		// Arithmetic operator - remainder/modulus
		result = secondValue % firstValue;
		System.out.println("Remainder: " + result);
		
		result = firstValue % secondValue;
		System.out.println("Remainder: " + result);
		
		// Break line
		System.out.println();
		System.out.println("========== Unary Operators ==========");
		/* Unary operators */
		int unaryValue = 5;
		
		// - operator
		result = -unaryValue;
		System.out.println("Result: " + result);
		
		// Break line
		System.out.println();
		
		System.out.println("========== Unary Operators: value++/value-- ==========");
		// ++ operator, unaryValue++
		// unaryValue has a 5.
		System.out.println("Original value: " + unaryValue);
		// unaryValue prints a 5, after printing, it increments to 6
		System.out.println("Result unaryValue++, value doesn't change: " + unaryValue++);
		// unaryValue incremented to 6 after printing in the previous line.
		System.out.println("Result unaryValue, value changed in previous line: " + unaryValue);
		
		// Break line
		System.out.println();
		System.out.println("========== Unary Operators: ++value/--value ==========");
		// ++ operator, ++unaryValue
		// unaryValue has a 6.
		System.out.println("Original value: " + unaryValue);
		// unaryValue prints a 7, because it increments BEFORE printing.
		System.out.println("Result ++unaryValue, value changes: " + ++unaryValue);
		
		// Break line
		System.out.println();
		System.out.println("========== Unary Operators: ! ==========");
		boolean booleanValue = true;
		// Boolean original value
		System.out.println("Boolean original value: " + booleanValue);
		// Boolean inverted/negated value
		System.out.println("Boolean inverted value: " + !booleanValue);
		
		// Break Line
		System.out.println();
		/* Equality Operators */
		System.out.println("========== Equality Operators ==========");
		System.out.println("1 == 2?: " + (1 == 2));
		System.out.println("1 >= 2?: " + (1 >= 2));
		System.out.println("1 < 2?: " + (1 < 2));
		
		// Break Line
		System.out.println();
		/* Conditional Operators */
		System.out.println("========== Conditional Operators ==========");
		System.out.println("true AND false?: " + (true && false));
		System.out.println("true AND true: " + (true && true));
		System.out.println("true OR false?: " + (true || false));
		System.out.println("false OR false?: " + (false || false));
		
		// Break Line
		System.out.println();
		/* Bitwise/Bitshift Operators */
		System.out.println("========== Bitwise/Bitshift Operators ==========");
		int bitmask = 0x000F; // 0000 0000 0000 1111
        int val = 0x2222;    //  0010 0010 0010 0010
        // & result: 0000 0000 0000 0010 = 2
        System.out.println("Bitwise AND: " + (val & bitmask));
        // | result: 0010 0010 0010 1111 = 8751
        System.out.println("Bitwise OR: " + (val | bitmask));
        // ^ result: 0010 0010 0010 1101 = 8749
        System.out.println("Bitwise XOR: " + (val ^ bitmask));
        
        bitmask = 0x0001; // this is 1 in binary: 0000 0000 0000 0001
        System.out.println("Shift left 2 positions: " + (bitmask<<2)); //it moves the 1 two spaces to the left to get 0100, that is 4.
        bitmask = 0x0004; // this is 2 in binary: 0000 0000 0000 0100.
        System.out.println("Shift right 1 position: " + (bitmask>>1)); //it moves the 1 one space to the right to get 0010, that is 2.
	}
}

package com.warrior.minds;

public class Arrays {

	public static void main(String[] args) {
		// Array declaration.
		int[] arrayOfInts;
		double[] arrayOfDoubles;
		
		// Initalizing the int array.
		// You will need to indicate the lenght of your array here.
		// Your array will have a 0 for value in all its positions.
		arrayOfInts = new int[10];
		
		// Initializing the boolean array.
		// You can set the values when you create the array.
		// Your array will get its length from the number
		// of values that you add here.
		boolean[] arrayOfBooleans = {false, false, true, true, false, true, true, false};
		
		// Initializing the double array.
		arrayOfDoubles = new double[5];
		
		// Adding values to the int array.
		arrayOfInts[0] = 0;
		arrayOfInts[1] = 54;
		arrayOfInts[2] = 8;
		arrayOfInts[3] = 90;
		arrayOfInts[4] = 1;
		arrayOfInts[5] = 23;
		arrayOfInts[6] = 0;
		arrayOfInts[7] = 21;
		arrayOfInts[8] = 0;
		arrayOfInts[9] = 3;
		
		System.out.println("ArrayOfInts at position 5: " + arrayOfInts[5]);
		
		// Adding values to the double array.
		// You use the array length as the condition.
		// Remember that the last position or index in your array
		// is the array lenght - 1.
		// You could also have i <= arrayOfDoubles.length - 1.
		for(int i = 0; i < arrayOfDoubles.length; i++){
			arrayOfDoubles[i] = (double)i;
		}		
		
		System.out.println("\nArray of doubles:");
		
		// Printing the array of doubles.
		for(double d : arrayOfDoubles){
			System.out.print(d + " ");
		}
		
		System.out.println("\n\nArray of booleans:");
		//Printing the array of booleans.
		for(int i = 0; i < arrayOfBooleans.length; i++){
			System.out.print(arrayOfBooleans[i] + " ");
		}
		
		// Declaring a multidimensional array of Strings.
		// This array will have 2 dimensions, each with a lenght of 3.
		String[][] multidimensionalArrayOfStrings = {{"dim1-value1","dim1-value2","dim1-value3"},
														{"dim2-value2","dim2-value2","dim2-value3"}};
		System.out.println("\n\nMultidimensional arrays");
		// Accessing a position in the multidimensional array.
		System.out.println("Value of 2D array in 1,2: " + multidimensionalArrayOfStrings[1][2]);
		
		// Accessing all elements in the 2D array
		System.out.println("\nAll the 2D array:");
		// First for loop iterates through all the rows. In this example, the array's length
		// is the number of rows - the lenght of this dimension.
		for(int row = 0; row < multidimensionalArrayOfStrings.length; row++){
			// Second for loop iterates through all the columns of each row.
			// You can get the number of columns using the array's first row.length.
			for(int column = 0; column < multidimensionalArrayOfStrings[0].length; column++){
				System.out.print(multidimensionalArrayOfStrings[row][column] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nAlternative way to access the 2D array:");
		// This first for will get the array of columns for each row.
		for(String[] columns : multidimensionalArrayOfStrings){
			// This second for will get the value of each column.
			for(String column : columns){
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}

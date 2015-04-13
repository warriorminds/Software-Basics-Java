package com.warrior.minds;

public class ControlStatements {

	public static void main(String[] args) {
		
		/* SIMPLE IF STATEMENT */
		System.out.println("SIMPLE IF STATEMENT");
		/*
		 * If statement. The code within the if will only be executed 
		 * if the value of gradeOfLastExam is greater than 5.
		 */
		int gradeOfLastExam = 10;
		if(gradeOfLastExam > 5){
			System.out.println("Congratulations. You passed the exam.");
		}
		
		/*
		 * Here you see that the condition is false, so the code within
		 * the if is not executed. 
		 */
		if(gradeOfLastExam <= 5){
			System.out.println("You failed the exam.");
		}
		
		/* IF-ELSE STATEMENT */
		System.out.println("\nIF - ELSE STATEMENT");
		/*
		 * There is a better way to do this. You can use the if-else statement
		 * to do something if the condition is true or do something else if
		 * the condition is false. All in the same if block.
		 * Notice how you can omit the curly brackets since there is only
		 * one line of code for the if and the else.
		 */
		if(gradeOfLastExam > 5)
			System.out.println("Congratulations. You passed the exam.");
		else
			System.out.println("You failed the exam.");
		
		/* IF-ELSE IF-ELSE STATEMENT */
		System.out.println("\nIF - ELSE IF - ELSE STATEMENT");
		/*
		 * For multiple evaluations, you can use if-else if statements.
		 * You can use else too at the end if you want to do something
		 * if the condition is not true in all the if-else if evaluations.
		 */
		gradeOfLastExam = 8;
		if(gradeOfLastExam >= 9){
			System.out.println("You don't need to take the final exam!");
		}else if(gradeOfLastExam >=6){
			System.out.println("You need to study for the final exam.");
		}else if(gradeOfLastExam >= 0 && gradeOfLastExam < 6){
			System.out.println("You need to take the course again.");
		}else{
			System.out.println("You probably live in a parallel universe with negative grades.");
		}
		
		/* SWITCH STATEMENT */
		System.out.println("\nSWITCH STATEMENT");
		/*
		 * countryCode has a value that represents a country. This switch statement
		 * tries to determine which country it is. In each case, you can add a different
		 * String value so then the countryName variable can be set correctly. If the countryCode
		 * value is not here, it will execute the default statement.
		 * IMPORTANT: add the break keyword at the end of teach case.
		 * EXCEPTION: if you want to adjacent cases to do the same, omit the break keyword and have
		 * something like this:
		 * 
		 * case 1:
		 * case 2:
		 * case 3:
		 * 	// do something here.
		 * break;
		 * default:
		 *  // do something else here.
		 *  break;
		 *  
		 * Here if your switch value has value of 1, 2 or 3, it will do the same for all of them.
		 */
		String countryCode = "mx", countryName = "";
		switch(countryCode){
		case "us":
			countryName = "United States";
			break;
		case "mx": 
			countryName = "Mexico";
			break;
		case "arg":
			countryName = "Argentina";
			break;
		case "ca":
			countryName = "Canada";
			break;
		case "fr":
			countryName = "France";
			break;
		default:
			countryName = "I don't know";
			break;
		}
		System.out.println(countryName);
		
		
		/* WHILE STATEMENT */
		System.out.println("\nWHILE STATEMENT");
		/*
		 * While statement will execute all the instructions within the while
		 * until the condition changes to false.
		 * 
		 */
		int count = 10;
		while(count >= 0){
			System.out.println("I am in a while statement");
			System.out.println("My count is " + count--);
		}
		System.out.println("Condition is false so I'm out of the loop");
		
		/* DO-WHILE STATEMENT */
		System.out.println("\nDO-WHILE STATEMENT");
		/*
		 * Do-while statement will execute the instructions first and then
		 * it will evaluate the condition. If it is false it will exit the loop, 
		 * having at least executed the instructions once.
		 */
		boolean conditionToBeFalse = false;
		do{
			System.out.println("I will show in the console even though the condition is false!");
		}while(conditionToBeFalse);
		System.out.println("Condition is false so I'm out of the loop");
		
		/* FOR STATEMENT */
		System.out.println("\nFOR STATEMENT");
		/*
		 * This code will print the values from 1 to 10 within the for statement.
		 * Notice how the initialization of variable i is done.
		 * The condition is that while i <= 10 repeat the loop.
		 * And the change is the increment by 1 of the variable i after each loop.
		 */
		for(int i = 1; i <= 10; i++){
			System.out.println("Count i: " + i);
		}
		System.out.println("Condition is false so I'm out of the loop. Also i variable does not exist anymore");
		
		/* FOR STATEMENT REVISITED */
		System.out.println("\nFOR STATEMENT FOR COLLECTIONS");
		/*
		 * If you have a collection of objects or values (we will cover this in a later post)
		 * you can use this type of for statement. It will iterate over each element of the 
		 * collection.
		 */
		int[] arrayOfNumbers = {5, 10, 15, 20, 25, 30, 35 };
		for(int number : arrayOfNumbers){
			System.out.println("Current number in arrayOfNumbers: " + number);
		}
		System.out.println("I'm done iterating over all the arrayOfNumbers. No more numbers left to process. I'm out of the for.");
		
		
		/* BRANCH STATEMENTS */
		/* BREAK */
		System.out.println("\nBREAK STATEMENT");
		/*
		 * This for is programmed to go from 0 to 9. But when the condition is met
		 * i == 5, it uses the break statement causing the for loop to terminate.
		 * It also works for while and do-while loops.
		 *  
		 */
		for(int i = 0; i < 10; i++){
			if(i == 5){
				System.out.println("A condition is met and break is called. I'm going out!");
				break;
			}
			System.out.println("I am in the for loop.");
		}
		System.out.println("I am out of the loop although it didn't complete all the iterations");
		
		/* CONTINUE */
		System.out.println("\nCONTINUE STATEMENT");
		/*
		 * This for is programmed to go from 0 to 9. But when the condition is met
		 * i == 5, it uses the continue statement causing the loop to go to the next
		 * iteration.
		 *  
		 */
		for(int i = 0; i < 10; i++){
			if(i == 5){
				continue;
			}
			System.out.println("i value: " + i);
		}
		System.out.println("I am out of the loop. I missed the 5 i value!");
		
		/* RETURN */
		System.out.println("\nRETURN STATEMENT");
		/*
		 * This for is programmed to go from 0 to 9. But when the condition is met
		 * i == 5, it uses the return statement causing the loop and the main method
		 * to terminate.
		 *  
		 */
		for(int i = 0; i < 10; i++){
			if(i == 5){
				return;
			}
			System.out.println("i value: " + i);
		}
		System.out.println("I am out of the loop. I am not printed!");
	}

}

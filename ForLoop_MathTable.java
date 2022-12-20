// Print 2 math tables at a time input from user
// Using For-Loop with Static Method
package com.maths.operations;
import java.util.Scanner;

public class ForLoop_MathTable {
	
	// Create a Static Method
	public static void multiplication(int fn) {
		
		// For-Loop Statement
		for (int j=1; j<=10; j++) {
			 
			System.out.println(fn+ "*" +j+ "=" +fn*j);
		}
	}

	public static void main(String[] args) {
		
		
				 @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
		
		// Create Print formula for user to put some input for multiplication
		System.out.println("Enter a number to create a math table 1");
		 int store1 = scanner.nextInt(); // User Input formula call by object
		 
		 System.out.println("Enter a number to create a math table 2");
		  int store2 = scanner.nextInt(); 
		 
		 System.out.println("Value of store 1 :" + store1);
		 System.out.println("Value of store 2 :" + store2);
		 System.out.println();
		 
		 multiplication(store1);
		 System.out.println();
		 multiplication(store2);
	}
}


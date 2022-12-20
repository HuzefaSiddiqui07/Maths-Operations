// Print 2 math tables at a time input from user
// Using While-Loop 

package com.maths.operations;
import java.util.*; // Or Use =>(import java.util.Scanner)

public class DoWhileLoop_MathTable{
	// Create a Static Method
	public static void  math_table (int fn) {
         int s = 1;
		// Do-While-Loop
		do {
			System.out.println(fn+ "*" +s+ "=" +fn*s);
			s++;
		} while (s<=10);
	}
	      @SuppressWarnings("resource")
		public static void main(String[] args) {
	    	  // Create an Scanner Object
	    	  Scanner maths = new Scanner(System.in);
	    	  
	   // Create Print formula for user to put some input for Math_Table
	    	  System.out.println("Enter a table 01 Value");
	    	  int content1 = maths.nextInt();
	    	  
	    	  System.out.println("Enter a table 02 Value");
	    	  int content2 = maths.nextInt();
	    	  
	    	  System.out.println("Store table 01 Value in :" + content1);
	    	  System.out.println("Store table 02 Value in :" + content2);
	    	  System.out.println();
	    	  
	    	  math_table(content1);
	    	  System.out.println();
	    	  math_table(content2);
	     }
	 }

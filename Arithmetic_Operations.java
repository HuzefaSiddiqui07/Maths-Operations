package com.maths.operations;
import java.util.*; // Or Use =>(import java.util.Scanner)
public class Arithmetic_Operations {
	// Create a Method 1
	public int addNumbers (int sf , int dm) {
		int addition = sf+dm;
		return addition;
	}
	// Create a Method 2
	public int subtractNumbers (int fs , int jk) {
		int subtraction = fs-jk;
		return subtraction;
	}
	// Create a Method 3
		public int multiplyNumbers (int fg , int sd) {
			int multiplication = fg*sd;
			return multiplication;
		}
     @SuppressWarnings("resource")
	public static void main(String[] args) {
		
	// Create an Scanner Object to give Or store some input from user
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter First Value");
	int box1 = sc.nextInt();
	
	System.out.println("Enter Second Value");
	int box2 = sc.nextInt();
	
	System.out.println("Store Fisrt Value in :" + box1);
	System.out.println("Store Fisrt Value in :" + box2);
	
	     // Create an Object to call the All Methods
	Arithmetic_Operations myobj = new Arithmetic_Operations();
	      
	     int result1 = myobj.addNumbers(box1, box2);
	     int result2 = myobj.subtractNumbers(box1, box2);
	     int result3 = myobj.multiplyNumbers(box1, box2);
	     
	     System.out.println("Addition Is :" + result1);
	     System.out.println("subtraction Is :" + result2);
	     System.out.println("multiplication Is :" + result3);
	   }
    }

package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopConstruct3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		// declare max number for minimum and max negative value for maximum, 
		// this way no matter the input, answer will set the first minimum and maximum
		float minimum = Float.MAX_VALUE;
		float maximum = -Float.MAX_VALUE;
		float total = 0;
		int number = 0;
		
		// Need to loop 5 times for 5 inputs
		while (number < 5) {
			System.out.print("Input a floating-point number: ");
			// This is the beginning of the body of the loop after the initial request
			try {
				// had to add float since this variable is only
				// created and used inside the loop as a place holder
				float answer = scnr.nextFloat();
				// Compound operator so total and answer are equal when end of input
				total += answer;
			
				// for each input, it compares it to the min to see if there is a new minimum
				if (answer < minimum) {
					minimum = answer;
				}
				// for each input, it compares it to the max to see if there is a new maximum
				if (answer > maximum) {
					maximum = answer;
				}
				// add to the number to progress loop
				number++;
			// this is the end of the body of the loop. Here you can "catch" the error
			}catch (InputMismatchException e) {
				System.out.println("That is not a valid entry.");
				scnr.next();
			}
		}
		System.out.println("Total is: " + total);
		System.out.println("Average is: " + (total / 5));
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);
		System.out.println("Interest on total at 20%: " + (total * .20));
		System.out.println("All done");
	}
}

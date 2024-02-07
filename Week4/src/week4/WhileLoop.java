package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoop {

		public static void main (String[] args) {
			Scanner scnr = new Scanner(System.in);
			// Declare integer
			int i = 1;
			
			// while (boolean-expression = true) statement happens
			while (i <= 5) {
				System.out.println("What is your lucky number?");
				try {
					int input = scnr.nextInt();
					System.out.println("Wow " + input + " is my lucky number too!");
					i++;
				}catch (InputMismatchException e) {
					System.out.println("That is not a number");
					scnr.next();
					continue;
				
				}
			}
			// Once the loop is no longer true, it exits the loop. 
			System.out.println("Loop ends here");
			
		}
}

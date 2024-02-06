package week4;

import java.util.Scanner;

public class LoopConstruct {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		float minimum = Float.MAX_VALUE;
		float maximum = -Float.MAX_VALUE;
		float total = 0;
		int number = 0;
		
		
		while (number < 5) {
			System.out.print("Input a floating-point number: ");
			float answer = scnr.nextFloat();
			total += answer;
		
			if (answer < minimum) {
				minimum = answer;
			}
			if (answer > maximum) {
				maximum = answer;
			}
			number++;
		}
		System.out.println("Total is: " + total);
		System.out.println("Average is: " + (total / 5));
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);
		System.out.println("Interest on total at 20%: " + (total * .20));
		System.out.println("All done");
	}
}

package week4;

import java.util.Scanner;

public class PickANumber2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number;
		
		do {
			System.out.println("Pick a number between 1 and 10");
			number = scnr.nextInt();
			
		} while(number < 1 || number > 10);
		System.out.println("You chose " + number);
		}
}
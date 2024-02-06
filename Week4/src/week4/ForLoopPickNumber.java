package week4;

import java.util.Scanner;

public class ForLoopPickNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int number;
		
		for( ; ; ) {
			System.out.println("Pick a number between 1 and 10");
			number = scnr.nextInt();
			
			if (number > 1 && number < 10){
				break;
			}
		}
		System.out.println("You chose " + number);
	}
}

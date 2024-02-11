package week4;

import java.util.Scanner;

public class PracticeWhilePassword2 {

	public static void main(String[] args) {

		// Sentry
		String password = "let me in";
		Scanner scnr = new Scanner(System.in);
		String guess;
		
			// variables stated in the curly braces are only used in the 
			// curly braces.
			// Start
			do {
				System.out.println("What is the password");
				guess = scnr.nextLine();
			// Finish
			} while (!guess.equals(password));
				System.out.println("Congrats");
				scnr.close();
	}
}


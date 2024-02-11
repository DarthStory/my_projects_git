package week4;

import java.util.Scanner;

public class PracticeWhilePassword {

	public static void main(String[] args) {

		System.out.println("Guess the password: ");
		String password = "let me in";
		Scanner scnr = new Scanner(System.in);
		String guess = scnr.nextLine();
		
				while(!guess.equals(password)) {
					System.out.println("Guess the password: ");
					guess = scnr.nextLine();
				}
				System.out.println("Congrats");
				scnr.close();

	}

}

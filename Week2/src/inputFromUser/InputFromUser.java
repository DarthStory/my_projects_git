package inputFromUser;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String greeting = "Hello, " + name + "!";
		System.out.println(greeting);
		
	}
}

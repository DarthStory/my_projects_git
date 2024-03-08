package atm;

import java.util.Scanner;



public class ATM {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name = null;
		String pass = null;
		User userName = new User(name, pass);
		
		System.out.println("Enter Account number and password.");
		
		System.out.println("Account Number: ");
		String Account = scnr.nextLine();
			if (Account == "Admin") {
				// prompt for Admin password
			}
			else {
				// prompt for account password
			}
			
			
		
	}

}

package phoneKeysWallet;

import java.util.Scanner;


public class PhoneKeysWallet2 {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		String phone;
		String wallet;
		String keys;
		int stuff = 0;
		
		
		System.out.println("Do you have your phone?");
		phone = scnr.next();
				
		System.out.println("Do you have your wallet?");
		wallet = scnr.next();
		
		System.out.println("Do you have your keys?");
		keys = scnr.next();
		
		if (phone.compareTo("yes") == 0) {
			stuff = 1;			
		}
		else {	
		}
		if (wallet.compareTo("yes") == 0) {
			stuff = stuff + 1;			
		}
		else {	
		}
		if (keys.compareTo("yes") == 0) {
			stuff = stuff + 1;
		}
		else {	
		}
			
			
		switch (stuff) {
		
			case 1:
				System.out.println("You are missing 2 things.");
				break;
			case 2:
				System.out.println("you are missing 1 thing.");
				break;
			case 3:
				System.out.println("you are good to go!!");
				break;
			default:
				System.out.println("You need to get your stuff!");
				break;
			
			}
		}
	}


package foodForDinner;

import java.util.Scanner;

public class FoodForDinner {
	public static void main (String [] args) {
		Scanner food = new Scanner(System.in);
		String meat;
	
		System.out.println("What type of meat do you have?");
		meat = food.next();
	
		if (meat.compareTo("Chicken") == 0) {
			System.out.println
			("How about Chicken and Rice, or, Chicken and Mac n Cheese?");
		}
		else if (meat.compareTo("Steak") == 0) {
			System.out.println("How about Steak and Eggs, or, Steak and Potatoes?");
		}
		else {
			System.out.println("Well then, I have no idea.");
		}
	}
}

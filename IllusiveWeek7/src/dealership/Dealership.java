package dealership;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		AutoInventory autoInventory = new AutoInventory();
		Scanner scnr = new Scanner(System.in);
		
		while(true) {
			// Start Menu
			System.out.println("Automobile Inventory");
			System.out.println("1. Add an automobile");
			System.out.println("2. Modify an automobile");
			System.out.println("3. Delete an automobile");
			System.out.println("4. View all automobiles");
			System.out.println("0. Exit Inventory");
			
			System.out.print("Choose option 0-4.");
			int choice = 0;
			try {
			choice = scnr.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid entry. Please try again. 0-4: ");
				scnr.nextInt();
			}
			switch (choice) {
			case 0:
				System.out.println("Exiting application.");
				scnr.close();
				return;
			case 1:
				// add 
				autoInventory.autoAddPrompt();
				break;
			case 2:
				// Modify an entry
				autoInventory.autoModifyPrompt();
				break;			
			case 3:
				// delete
				autoInventory.autoDeletePropt();
				break;
			case 4:
				// View all automobiles
				autoInventory.viewAutomobiles();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
			System.out.println();
		}
	}
}

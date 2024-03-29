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
				System.out.println("Enter Make, Model, Color, Year, and Mileage");
				String make = scnr.next();
				String model = scnr.next();
				String color = scnr.next();
				
				int year = 0;
				while(year == 0) {
					try {
						year = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
					}
				}
				int mileage = 0;
				while (mileage == 0) {
					try {
						mileage = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid mileage. Please enter again.");
					}
				}
				autoInventory.addAutomobile(make, model, color, year, mileage);
				System.out.println("Automobile added");
				break;
			case 2:
				// Modify an entry
				System.out.print("Enter the number of the automobile to modify: ");
				int modifyIndex = 0;
				try {
				modifyIndex = scnr.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid number. Please try again.");
					scnr.nextInt();
				}
				
				if(modifyIndex <= 0 || modifyIndex > autoInventory.getAutomobiles().size()) {
					System.out.println("Invalid number. Please try again.");
					break;
				}
				
				System.out.println("Enter a new automobile Make, Model, Color, Year, and Mileage.");
				String newMake = scnr.next();
				String newModel = scnr.next();
				String newColor = scnr.next();
			
				int newYear = 0;
				while (newYear == 0) {
					try {
						newYear = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
						scnr.next();
						break;
					}
				}
				int newMileage = 0;
				while (newMileage == 0) {
					try {
						newMileage = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
						scnr.next();
						break;
					}
				}
				autoInventory.editAutomobile(modifyIndex - 1, newMake, newModel, newColor, newYear, newMileage);
				System.out.println("Automobile modified successfuly.");
				break;			
			case 3:
				// delete
				System.out.println("Enter the number of the automobile to delete: ");
				int deleteIndex = 0;
				try {
				deleteIndex = scnr.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid number. Please try again.");
					scnr.nextInt();
				}
				
				if (deleteIndex <= 0 || deleteIndex > autoInventory.getAutomobiles().size()) {
					System.out.println("Invalid number. Please try again.");
					break;
				}
				autoInventory.deleteAutomobile(deleteIndex - 1);
				System.out.println("Automobile deleted successfully.");
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

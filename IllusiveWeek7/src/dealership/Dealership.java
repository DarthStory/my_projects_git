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
			
			System.out.print("Choose option: ");
			int choice = scnr.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Exiting application.");
				return;
			case 1:
				// add 
				System.out.println("Enter Make, Model, Color, Year, and Mileage");
				String model = scnr.next();
				String make = scnr.next();
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
				int modifyIndex = scnr.nextInt();
				scnr.nextLine();
				
				if(modifyIndex <= 0 || modifyIndex > autoInventory.getAutomobiles().size()) {
					System.out.println("Invalid number. Please try again.");
				}
				
				System.out.println("Enter a new automobile Make, Model, Color, Year, and Mileage.");
				String newMake = scnr.nextLine();
				String newModel = scnr.nextLine();
				String newColor = scnr.nextLine();
			
				int newYear = 0;
				while (newYear == 0) {
					try {
						newYear = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
					}
				}
				int newMileage = 0;
				while (newMileage == 0) {
					try {
						newMileage = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
					}
				}
				autoInventory.editAutomobile(modifyIndex, newMake, newModel, newColor, newYear, newMileage);
				System.out.println("Automobile modified successfuly.");
				break;			
			case 3:
				// delete
				System.out.println("Enter the number of the automobile to delete: ");
				int deleteIndex = scnr.nextInt();
				scnr.nextLine();
				
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
			scnr.close();
		}
	}
}

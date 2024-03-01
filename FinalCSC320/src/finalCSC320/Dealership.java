package finalCSC320;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		AutoInventory auto = new AutoInventory();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Follow the prompts for: Make, Model, Color, Year, Mileage");
		auto.addAutomobile(new Automobile(scnr.next(), scnr.next(), scnr.next(),
				scnr.nextInt(), scnr.nextInt()));
		auto.displayAuto();
		
		System.out.println("Do you want to: \n1 Delete, \n2 Modify or \n3 Exit");
		int choice = scnr.nextInt();
		switch (choice) {
			case 1:
				System.out.println("Enter the make of the car to delete: ");
				String makeToDelete = scnr.next();
				if (auto.deleteAutomobile(makeToDelete)) {
				}
				else {
					System.out.println("Car not Found.");
				}
				break;
			case 2:
				System.out.println("Enter the make of the car to modify:");
                String makeToModify = scnr.next();
                System.out.println("Enter new details (Make, Model, Color, Year, Mileage). Enter for no change:");
                
                scnr.nextLine(); // Consume leftover newline
                String newMake = scnr.nextLine();
                String newModel = scnr.nextLine();
                String newColor = scnr.nextLine();
                int newYear = scnr.nextInt();
                int newMileage = scnr.nextInt();

                // Check if the modification was successful
                if (auto.modifyAutomobile(makeToModify, newMake.isEmpty() ? null : newMake, 
                                                   newModel.isEmpty() ? null : newModel, 
                                                   newColor.isEmpty() ? null : newColor, 
                                                   newYear <= 0 ? null : newYear, 
                                                   newMileage <= 0 ? null : newMileage)) {
                    System.out.println("Car modified successfully.");
                } else {
                    System.out.println("Car not found.");
                }
			case 3:
				System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option.");
                break;
		}
		auto.displayAuto();
	}
}

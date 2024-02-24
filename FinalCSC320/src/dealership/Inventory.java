package dealership;

import java.util.Scanner;

public class Inventory {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int vehicleOption;
		String make = null;
		String model = null;
		String color = null;
		String year = null;
		String milage = null;
		
		
		System.out.println("Pick an option. \n1. Add vehicle. \n2. Delete vehicle. \n3. Modify vehicle.");
		vehicleOption = scnr.nextInt();
		switch (vehicleOption) {
			case 1:
				System.out.println("Add vehicle. Please enter: Make, Model, Color, Year, Milage");
				addVehicle addWhip = new addVehicle(make, model, color, year, milage);
				System.out.print(addWhip.make + " ");
				System.out.print(addWhip.model + " ");
				System.out.print(addWhip.color + " ");
				System.out.print(addWhip.year + " ");
				System.out.println(addWhip.milage);
				System.out.println(addWhip);
				
				break;
			case 2:
				System.out.println("Delete vehicle.");
				break;
			case 3:
				System.out.println("Modify vehicle.");
				break;
		}
		scnr.close();
	}
}

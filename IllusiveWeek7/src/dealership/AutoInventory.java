package dealership;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class AutoInventory {

		private List<Automobile> automobiles;
		Scanner scnr = new Scanner(System.in);
		
		//Constructor
		public AutoInventory() {
			automobiles = new ArrayList<>();
		}
		public void addAutomobile(String make, String model, String color, int year, int mileage) {
			Automobile automobile = new Automobile(make, model, color, year, mileage);
			automobiles.add(automobile);
		}
		// Edit an Automobile
		public void editAutomobile(int index, String make, String model, String color, int year, int mileage) {
			Automobile automobile = automobiles.get(index);
			automobile.setMake(make);
			automobile.setModel(model);
			automobile.setColor(color);
			automobile.setYear(year);
			automobile.setMileage(mileage);
		}
		
		public List<Automobile> getAutomobiles() {
			return automobiles;
		}
		
		// view all Automobiles
		public void viewAutomobiles() {
			if (automobiles.isEmpty()) {
				System.out.println("No automobiles found.");
				return;
			}
			
			for(int i = 0; i < automobiles.size(); i++) {
				System.out.print("Automobile #" + (i + 1) + " ");
				System.out.println(automobiles.get(i));
			}
		}
		
		// Delete an automobile
		public void deleteAutomobile(int index) {
			automobiles.remove(index);
		}
		public void autoAddPrompt() {
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
			addAutomobile(make, model, color, year, mileage);
			System.out.println("Automobile added");
		}
		public void autoModifyPrompt() {
			System.out.print("Enter the number of the automobile to modify: ");
			int modifyIndex = 0;
			try {
			modifyIndex = scnr.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid number. Please try again.");
				scnr.nextInt();
			}
			
			if(modifyIndex <= 0 || modifyIndex > getAutomobiles().size()) {
				System.out.println("Invalid number. Please try again.");
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
				}
			}
			int newMileage = 0;
			while (newMileage == 0) {
				try {
					newMileage = scnr.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid year. Please enter again.");
					scnr.next();
				}
			}
			editAutomobile(modifyIndex - 1, newMake, newModel, newColor, newYear, newMileage);
			System.out.println("Automobile modified successfuly.");
		}
		public void autoDeletePropt() {
			System.out.println("Enter the number of the automobile to delete: ");
			int deleteIndex = 0;
			try {
			deleteIndex = scnr.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid number. Please try again.");
				scnr.nextInt();
			}
			
			if (deleteIndex <= 0 || deleteIndex > getAutomobiles().size()) {
				System.out.println("Invalid number. Please try again.");
			}
			deleteAutomobile(deleteIndex - 1);
			System.out.println("Automobile deleted successfully.");
		}
}

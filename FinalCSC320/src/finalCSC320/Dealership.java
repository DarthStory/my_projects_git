package finalCSC320;

import java.util.Scanner;


public class Dealership {

	public static void main(String[] args) {
		AutoInventory auto = new AutoInventory();
		Scanner scnr = new Scanner(System.in);
		
		String make;
		String model;
		String color;
		int year;
		int mileage;
		
		System.out.println("Enter: Make, Model, Color, Year, Mileage");
		auto.addAutomobile(new Automobile(make, model, color, year, mileage));
	}
}

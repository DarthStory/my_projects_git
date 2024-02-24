package dealership;

import java.util.Scanner;

public class addVehicle {
String[] vehicle = new String[5];
String make;
String model;
String color;
String year;
String milage;
	
	public addVehicle(String make, String model, String color, String year, String milage) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is the make of the Vehicle?");
		this.make = scnr.next();
		vehicle[0] = make;
		
		System.out.println("What is the model of the Vehicle?");
		this.model = scnr.next();
		vehicle[1] = model;
		
		System.out.println("What is the color of the Vehicle?");
		this.color = scnr.next();
		vehicle[2] = color;
		
		System.out.println("What is the year of the Vehicle?");
		this.year = scnr.next();
		vehicle[3] = year;
		
		System.out.println("What is the milage of the Vehicle?");
		this.milage = scnr.next();
		vehicle[4] = milage;
		
		System.out.println("You entered: " + vehicle.length);	
	}
	@Override
	public String toString() {
		return make + " " + model + " " + color + " " + year + " " + milage;
	}
}
package finalCSC320;

import java.util.Scanner;

public class addVehicle {
	Scanner scnr = new Scanner(System.in);
	private String make;
	String model;
	String color;
	int year;
	int milage;
	
	void setMake(String make) {
		this.make = make;
	}
	String getMake() {
		return make;
	}
}

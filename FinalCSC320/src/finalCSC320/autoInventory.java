package finalCSC320;

import java.util.Scanner;

public class autoInventory {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	
	public autoInventory(String make, String model, String color, int year, int mileage) {
		Scanner scnr = new Scanner(System.in);
				System.out.print("Please enter the info from the following prompts. \nMake: ");
				this.setMake(scnr.next());
				System.out.print("Model: ");
				this.setModel(scnr.next());
				System.out.print("Color: ");
				this.setColor(scnr.next());
				System.out.print("Year: ");
				this.setYear(scnr.nextInt());
				System.out.print("Mileage: ");
				this.setMileage(scnr.nextInt());
		scnr.close();
	}
	public 
	@Override
	public String toString() {
		return "Make: " + make + "\n" + "Model: " + model + "\n" 
				+ "Color: " + color + "\n" + "Year: " + year + "\n" + "Miles: " + mileage + "\n";
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

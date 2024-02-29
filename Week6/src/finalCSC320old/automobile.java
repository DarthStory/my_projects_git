package finalCSC320old;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class automobile {
	LinkedList<Object> auto = new LinkedList<>();
	public void auto(String make, String model, String color, int year, int mileage) {
	Scanner scnr = new Scanner(System.in);
	make = null;
	model = null;
	color = null;
	year = 0;
	mileage = 0;
	
	System.out.println("Give the make of your vehicle.");
	String answer = scnr.nextLine();
	System.out.println("Give the model of your vehicle.");
	String answer1 = scnr.nextLine();
	System.out.println("Give the color of your vehicle.");
	String answer2 = scnr.nextLine();
	System.out.println("Give the year of your vehicle.");
	Integer answer3 = scnr.nextInt();
	System.out.println("Give the milage of your vehicle.");
	Integer answer4 = scnr.nextInt();
	
	make = answer;
	model = answer1;
	color = answer2;
	year = answer3;
	mileage = answer4;
	
	System.out.println(auto);
	
	}
}

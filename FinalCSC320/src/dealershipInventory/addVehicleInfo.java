package dealershipInventory;

import java.util.ArrayList;
import java.util.Scanner;

public class addVehicleInfo {

	String make;
	String model;
	String color;
	int year;
	int milage;
	
	
	public addVehicleInfo(ArrayList<String> make, ArrayList<String> model, ArrayList<String> color,
			ArrayList<Integer> year, ArrayList<Integer> milage) {
		Scanner scnr = new Scanner(System.in);
		String answer = scnr.nextLine();
		String answer2 = scnr.nextLine();
		String answer3 = scnr.nextLine();
		Integer answer4 = scnr.nextInt();
		Integer answer5 = scnr.nextInt();
		if (!make.contains(answer)) {
			if (!model.contains(answer2)) {
				if (!color.contains(answer3)) {
					if (!year.contains(answer4)) {
						if (!milage.contains(answer5)); {
							make.add(answer);
							model.add(answer2);
							color.add(answer3);
							year.add(answer4);
							milage.add(answer5);
						}
					}
				}
			}
		}
		System.out.print(make);
		System.out.print("");
		System.out.print(model);
		System.out.print("");
		System.out.print(color);
		System.out.print("");
		System.out.print(year);
		System.out.println(milage);
		
		
	}
}

package dealershipInventory;

import java.util.ArrayList;

public class InteractiveDealershipInventory {

	public static void main(String[] args) {
		
		
		ArrayList<String> make = new ArrayList<>();
		ArrayList<String> model = new ArrayList<>();
		ArrayList<String> color = new ArrayList<>();
		ArrayList<Integer> year = new ArrayList<>();
		ArrayList<Integer> milage = new ArrayList<>();
		
		// name of the class, name of the variable, 
		newInventory newInv = new newInventory();
		addVehicleInfo carTruck = new addVehicleInfo(make, model, color, year, milage);
		
		
		
		
	}
}

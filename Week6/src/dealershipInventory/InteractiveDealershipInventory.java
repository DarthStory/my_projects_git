package dealershipInventory;

import java.util.ArrayList;

public class InteractiveDealershipInventory {

	public static void main(String[] args) {
		
		
		ArrayList<String> make = new ArrayList<>();
		ArrayList<String> model = new ArrayList<>();
		ArrayList<String> color = new ArrayList<>();
		ArrayList<Integer> year = new ArrayList<>();
		ArrayList<Integer> milage = new ArrayList<>();
		
		// name of the class, name of the variable, new(claiming new object), object to be called upon.  
		newInventory newInv = new newInventory();
		// same, only with variables
		addVehicleInfo carTruck = new addVehicleInfo(make, model, color, year, milage);
		
	// this is the constructor on another "page"	
//	public newInventory() {
		// here is where the body of said code would go like normal. 
	}
		
		
		
		
		
	}

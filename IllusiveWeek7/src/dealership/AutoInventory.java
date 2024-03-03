package dealership;

import java.util.ArrayList;
import java.util.List;

public class AutoInventory {

		private List<Automobile> automobiles;
		
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
				System.out.println(); // empty line for formatting
			}
		}
		
		// Delete an automobile
		public void deleteAutomobile(int index) {
			automobiles.remove(index);
		}
}

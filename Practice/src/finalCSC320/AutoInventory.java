package finalCSC320;

import java.util.ArrayList;
import java.util.List;

public class AutoInventory {
	private List<Automobile> auto = new ArrayList<>();
	
	public void addAutomobile(Automobile automobile) {
		auto.add(automobile);
	}
	public boolean deleteAutomobile(String make) {
		return auto.removeIf(auto -> auto.getMake().equals(make));
	}
	public boolean modifyAutomobile(String make, String newMake, String newModel, String newColor,
			Integer newYear, Integer newMileage) {
		for (Automobile automobile : auto) {
			if (automobile.getMake().equals(make)) {
				if (newMake != null && !newMake.isEmpty()) automobile.setMake(newMake);
				if (newModel != null && !newModel.isEmpty()) automobile.setModel(newModel);
				if (newColor != null && !newColor.isEmpty()) automobile.setColor(newColor);
				if (newYear != null && newYear > 0) automobile.setYear(newYear);
				if (newMileage > 0) automobile.setMileage(newMileage);
				return true;
			}
		}
		return false;
	}
	
	public void displayAuto() {
		for(Automobile automobile : auto) {
			System.out.println(auto);
		}
	}

}
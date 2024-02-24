package finalCSC320;

import java.util.Scanner;

public class DealershipInventory {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		addVehicle addauto = new addVehicle();
		addauto.setMake(scnr.next());
		addauto.model = null;
		addauto.color = null;
		addauto.year = 0;
		addauto.milage = 0;
		
		System.out.println(addauto.getMake());
	}

}

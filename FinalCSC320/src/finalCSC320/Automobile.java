package finalCSC320;

import java.util.Scanner;


public class Automobile {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean car = false;
		autoInventory auto = new autoInventory(null, null, null, 0, 0);
		autoDelete autoDelete = new autoInventory(null, null, null, 0, 0);
		while (car == false) {
			System.out.println("Would you like to: \n 1-Add, 2-Delete, 3-Modify, 4-exit");
			switch (scnr.nextInt()) {
			case 1:
				
				System.out.println(auto);
				break;
			case 2:
				
				break;
			case 3:
				
				break;				
			case 4:
				
				break;
				
		}
		
		}
		scnr.close();
	}
}

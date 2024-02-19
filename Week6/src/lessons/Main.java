package lessons;

import java.util.Scanner;

public class Main {
	
	private static String [] months = 
		{"January", "February", "March", "April",
				"May", "June", "July", "August", 
				"September", "October", "November","December"};
	
	public static void main(String[] args) {
		
//		loopMonths();
		loopMonths();
		
		Scanner scnr = new Scanner(System.in);
		while (true) { // infinite loop that qill keep asking this until "" empty string, then "break;"
			System.out.println("Enter in a month.");
			String monthName = scnr.nextLine();
			if (monthName.equals("")) {
				break;
			}
			// using the method "getMonthNumber"
			int monthNumber = getMonthNumber(monthName);
			// evaluate the number that the method returns, if it matches -1, it wasnt there 
			if(monthNumber == -1) {
				System.out.println("Month not found.");
			}
			// output the month like this, if found.
			else {
				// format %s is string, and %d is decimal integer (doesn't have a decimal in it)that would be "f" for float
				System.out.println(String.format("%s is month number %d", monthName, monthNumber + 1));
			}
		}
	}
	// refactor extract method creates this header
	private static void loopMonths() {
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
	}
	// private and static, but return a value, so "int" then the name "getMonthNumber" (String with name "monthName")
	private static int getMonthNumber(String monthName) {
		for (int i = 0; i < months.length; i++) {
			// if to use the input "monthName" then equalsIgnoreCase (so uppercase/lowercase doesnt matter
			// and if it matches against any data points of the index "months"
			if (monthName.equalsIgnoreCase(months[i])) {
				// if it matches, return that month
				return i;
			}
		}
		// return -1, meaning it did not find anything
		return -1;
	}
}

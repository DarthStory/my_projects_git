package criticalThinking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;


public class GetWeeklyTempsFinal {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// first array for the months
		ArrayList<String> months = new ArrayList<>();
		// second array for the average temps
		ArrayList<Integer> averageTemps = new ArrayList<>();
		// to figure out min/max
		int total = 0;
		// to progress the while loop for the gathering of inputs from user
		int i = 0;
		// to start at the minimum and maximum
		int minimum = Integer.MAX_VALUE;
		int maximum = -Integer.MAX_VALUE;
		
		// while the loop has happens for 12 iterations
		// Loop to get Month and average temps of that month from the user
		while (i < 12) {
			System.out.println("What Month is it?");
			String answer = scnr.next();
			// If they gave a month that was not in the array, it would add
			// it and progress to asking for an average temp. 
			if (!months.contains(answer)) {
				months.add(answer);
				System.out.println("What was the average temp of that month?");
				// if user inputs a string instead of an int
				try {
				Integer temp = scnr.nextInt();
				// for adding the temp to the array
				averageTemps.add(temp);
				// find the min/max average temp of the year
				total += temp;
					if (temp < minimum) {
						minimum = temp;
					}
					if (temp > maximum) {
						maximum = temp;
					}
				// progresses while loop
				++i;
				// to catch the mismatch exception
				}catch (InputMismatchException e) {
					System.out.println("Put in an average degree for the month.");
				}
			}
			// if the month was already put in
			else {
				System.out.println("You already added that month.");
			}
			
		}
		// starts the question after all the information has been entered into the arraylists
		String mon;
		System.out.println("If you want the a specific Month's average, type that month."
				+ " If you want the whole year, with average, Min/Max temp, type year");
		// gets the input from the user, "Month" or "year"
		mon = scnr.next();
		// searches for "mon" input in the months arraylist
		int index = months.indexOf(mon);
		// if "mon" is in the months array specifically, it outputs that month and its average temp
		if (months.contains(mon)) {
		System.out.println(mon + " average of " + averageTemps.get(index) + " degrees.");
		}
		// if the user type in "year", then this runs
		else if (mon.equals("year")) {
			// initializes the listiteration class
			ListIterator<String> iterator = months.listIterator();
			ListIterator<Integer> iterators = averageTemps.listIterator();
			int j = 0;
			// while loop to go through both the String arraylist and the Integer arraylist
			while (j < 12) {
				// prints out each iteration of the months arraylist and the averageTemps array list. 
				System.out.println(iterator.next() + " was an average"
					+ " of " + iterators.next() + " degrees.");
				// progresses while loop
				++j;
			}
			// prints out required output for the "year" input
			System.out.println("Maximum temp for the year was: " + maximum);
			System.out.println("Minimum temp for the year was: " + minimum);
			System.out.println("Average temp for the whole year was: " + total / 12);

		}
		// if they type anything besides the specific month or "year", this prints out. 
		else {
			System.out.println("Isn't Chicago weather something??");
		}		
	}		
}

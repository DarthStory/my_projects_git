package criticalThinking;

import java.util.Scanner;
import java.util.ArrayList;
// this progresses the index of the array to print the next index in the array
import java.util.ListIterator;
// for now, this is to stop the error at the end of the array, I need to figure
// out how to stop at the end of the array. 
import java.util.NoSuchElementException;

public class GetWeeklyTemps2 {
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
		
		// while the loop has happened for less than 13 iterations
		// Loop to get Month and average temps of that month from the user
		while (i < 12) {
			System.out.println("What Month is it?");
			String answer = scnr.next();
				// If they gave a month that was not in the array, it would add
				// it and progress to asking for an average temp. 
				if (!months.contains(answer)) {
					months.add(answer);
					System.out.println("What was the average temp of that month?");
					Integer temp = scnr.nextInt();
					// for adding the temp to the array
					averageTemps.add(temp);
					// utilizing this from the last project to find the min/max
					// average temp of the year
					total += temp;
						if (temp < minimum) {
							minimum = temp;
						}
						if (temp > maximum) {
							maximum = temp;
						}
					// progresses while loop
					++i;
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
				// This prints out the first month, need to figure out how to start at 0
				// FOUND THIS WAS NOT NEEDED AFTER I TOOK OUT THE "ITERATOR.NEXT();" BELOW, IT ACTUALLY STARTED AT 0
//				System.out.println(months.getFirst() + " was an average of " 
//						 + averageTemps.getFirst() + " degrees.");
				int j = 0;
				// this seems to make the first iteration 1, using -1 for j did not resolve the issue.
				// this starts the progression of the iterations
				// EDIT - THIS WAS NOT NEEDED - NO NEED FOR THE TRY/CATCH AS IT STOPPED ERRORING OUT
//				iterator.next();
				// while loop to go through both the String Arraylist and the Integer arraylist
				while (j < 12) {
					// found this last week to catch an exception after I turned in the project. 
					//I am not sure this is "cheating" as it
					// is a legit class for catching errors. However, I feel that it should stop if < 12.. but 
					// it does not seem to. 
//					try {
					// prints out each iteration of the months arraylist and the averageTemps array list. 
					System.out.println(iterator.next() + " was an average"
							+ " of " + iterators.next() + " degrees.");
					++j;
					// the catch for the exception when it is thrown
//					}catch (NoSuchElementException e) {
//						break;
//					}
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

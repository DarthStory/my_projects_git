package criticalThinking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class GetWeeklyTemps2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> months = new ArrayList<>();
		ArrayList<Integer> averageTemps = new ArrayList<>();
		int total = 0;
		int i = 0;
		int minimum = Integer.MAX_VALUE;
		int maximum = -Integer.MAX_VALUE;
		
		while (i < 12) {
			System.out.println("What Month is it?");
			String answer = scnr.next();
				if (!months.contains(answer)) {
					months.add(answer);
					System.out.println("What was the average temp of that month?");
					Integer temp = scnr.nextInt();
					averageTemps.add(temp);
					total += temp;
						if (temp < minimum) {
							minimum = temp;
						}
						if (temp > maximum) {
							maximum = temp;
						}
					++i;
				}
				else {
					System.out.println("You already added that month.");
				}
			
		}
		String mon;
		System.out.println("If you want the a specific Month's average, type that month."
				+ " If you want the whole year, with average, Min/Max temp, type year");
		mon = scnr.next();
		int index = months.indexOf(mon);
			if (months.contains(mon)) {
			System.out.println(mon + " average of " + averageTemps.get(index) + " degrees.");
			}
			else if (mon.equals("year")) {
				ListIterator<String> iterator = months.listIterator();
				ListIterator<Integer> iterators = averageTemps.listIterator();
				int j = 0;
				while (j < 12) {
					System.out.println(iterator.next() + " was an average"
							+ " of " + iterators.next() + " degrees.");
					++j;
				}
				System.out.println("Maximum temp for the year was: " + maximum);
				System.out.println("Minimum temp for the year was: " + minimum);
				System.out.println("Average temp for the whole year was: " + total / 12);

			}
			else {
				System.out.println("Isn't Chicago weather something??");
			}		
	}		
}

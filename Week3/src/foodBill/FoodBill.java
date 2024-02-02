package foodBill;

import java.util.Scanner;

public class FoodBill {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		double week1;
		double week2;
		double week3;
		double week4;
		double monthlyTotal;
		double weeklyAverage;
		double couponAmount;
		double monthlyTotalCoupon;
		double weeklyAverageCoupon;
		double weeklySavings;
		double monthlySavings;
		
		System.out.println("How much did you spend on groceries in the first week?");
		week1 = scnr.nextDouble();
		
		System.out.println("How much did you spend on groceries in the second week?");
		week2 = scnr.nextDouble();
		
		System.out.println("How much did you spend on groceries in the third week?");
		week3 = scnr.nextDouble();
		
		System.out.println("How much did you spend on groceries in the forth week?");
		week4 = scnr.nextDouble();
		
		System.out.println("How much were your coupons worth in decimal points? Example, 5% would be .05");
		couponAmount = scnr.nextDouble();
		
		if (couponAmount > .10)
			couponAmount = .10;
		
		if (couponAmount <= 0)
			couponAmount = .10;
		
		
		
		monthlyTotal = (week1 + week2 + week3 + week4);
		weeklyAverage = monthlyTotal / 4;
		
		monthlyTotalCoupon = monthlyTotal * couponAmount;
		weeklyAverageCoupon = weeklyAverage * couponAmount;
		
		weeklySavings = weeklyAverage - weeklyAverageCoupon;
		monthlySavings = monthlyTotal - monthlyTotalCoupon;
		
		System.out.print("Monthly total: $");
		System.out.printf("%.2f", monthlyTotal);
		System.out.println("");
		
		System.out.print("Weekly average: $");
		System.out.printf("%.2f", weeklyAverage);
		System.out.println("");
		
		System.out.print("Montly Total with Coupons: $");
		System.out.printf("%.2f", monthlyTotalCoupon);
		System.out.println("");
		
		System.out.print("Weekly average with Coupons: $");
		System.out.printf("%.2f", weeklyAverageCoupon);
		System.out.println("");
		
		System.out.print("Congradulations! This is how much you saved this month!: $");
		System.out.printf("%.2f", monthlySavings);
		System.out.println("");
		
		System.out.print("You also saved this much per week!!: $");
		System.out.printf("%.2f", weeklySavings);
		System.out.println("");
		
		
		
		
				
		
	}

}

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
		
		
		// This is where I ask the user to input and then I assign that input to a variable
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
		
		// Coupon amount needs to be 10% if over 100% or under 0
		if (couponAmount > 1.0)
		couponAmount = .10;
		
		if (couponAmount <= 0.0)
		couponAmount = .10;
		
		
		// giving the monthly total
		monthlyTotal = (week1 + week2 + week3 + week4);
		System.out.print("Monthly total: $");
		System.out.printf("%.2f", monthlyTotal);
		System.out.println("");
		
		// giving the coupon discount depending on what they entered
		monthlyTotalCoupon = monthlyTotal * couponAmount;
		System.out.print("Coupon Discount: $");
		System.out.printf("%.2f", monthlyTotalCoupon);
		System.out.println("");	
		
		// giving the amount saved after the coupon discount
		monthlySavings = (monthlyTotal - monthlyTotalCoupon);
		System.out.print("Monthly total after coupons: $");
		System.out.printf("%.2f", monthlySavings);
		System.out.println("");
		
		// giving the weekly average	
		weeklyAverage = monthlyTotal / 4;
		System.out.print("Weekly average: $");
		System.out.printf("%.2f", weeklyAverage);
		System.out.println("");
		
		// giving the coupon discount depending on what they entered	
		weeklyAverageCoupon = weeklyAverage * couponAmount;
		System.out.print("Coupon Discount: $");
		System.out.printf("%.2f", weeklyAverageCoupon);
		System.out.println("");
		
		// giving the amount saved after the coupon discount	
		weeklySavings = (weeklyAverage - weeklyAverageCoupon);
		System.out.print("Weekly total after coupons: $");
		System.out.printf("%.2f", weeklySavings);
		System.out.println("");
	}
}

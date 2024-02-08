package foodBill;

import java.util.Scanner;

public class FoodBill3 {
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
		System.out.println("How much did you spend on groceries each week? Enter in all 4 weeks.");
		week1 = scnr.nextDouble();
		week2 = scnr.nextDouble();
		week3 = scnr.nextDouble();
		week4 = scnr.nextDouble();
		
		System.out.println("How much were your coupons worth in decimal points? Example, 5% would be .05");
		couponAmount = scnr.nextDouble();
		
		// Coupon amount needs to be 10% if over 100% or under 0
		if (couponAmount > 1.0)
		couponAmount = .10;
		
		else if (couponAmount <= 0.0)
		couponAmount = .10;
		
		
		// giving the monthly total
		monthlyTotal = (week1 + week2 + week3 + week4);
		System.out.printf("Monthly total: $%.2f\n", monthlyTotal);
		
		// giving the coupon discount depending on what they entered
		monthlyTotalCoupon = monthlyTotal * couponAmount;
		System.out.printf("Monthly Coupon Discount: $%.2f\n",monthlyTotalCoupon);
		
		// giving the amount saved after the coupon discount
		monthlySavings = (monthlyTotal - monthlyTotalCoupon);
		System.out.printf("Monthly total after coupons: $%.2f\n",monthlySavings);
		
		// giving the weekly average	
		weeklyAverage = monthlyTotal / 4;
		System.out.printf("Weekly average: $%.2f\n",weeklyAverage);
		
		// giving the coupon discount depending on what they entered	
		weeklyAverageCoupon = weeklyAverage * couponAmount;
		System.out.printf("Weekly Coupon Discount: $%.2f\n", weeklyAverageCoupon);
		
		// giving the amount saved after the coupon discount	
		weeklySavings = (weeklyAverage - weeklyAverageCoupon);
		System.out.printf("Weekly total after coupons: $%.2f\n", weeklySavings);

	}
}

package ageYearsOld;

import java.util.Scanner;

public class AgeYearsOld {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears;
      int userAgeDays;
      int userAgeMinutes;
      
      System.out.print("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;               // Calculate days without leap years
      userAgeDays = userAgeDays + (userAgeYears / 4); // Add days for leap years
   
      System.out.println("You are " + userAgeDays + " days old.");
   
      userAgeMinutes = userAgeDays * 24 * 60;         // 24 hours/day, 60 minutes/hour
      System.out.println("You are " + userAgeMinutes + " minutes old.");
   }
}
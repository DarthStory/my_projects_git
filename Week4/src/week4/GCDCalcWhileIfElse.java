package week4;

import java.util.Scanner;

//Output GCD of user-input numA and numB

public class GCDCalcWhileIfElse {
public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   int numA;  // User input
   int numB;  // User input

   System.out.print("Enter first positive integer: ");
   numA = scnr.nextInt();

   System.out.print("Enter second positive integer: ");
   numB = scnr.nextInt();

   // while a is not equal to b, the while loop is true
   while (numA != numB) { // Euclid's algorithm
      // if numb b is greater than num a
	  if (numB > numA) {
         numB = numB - numA;
      }
	  // if num a is greater than num b
      else {
         numA = numA - numB;
         //loop until both a and b are equal, that is the Greatest Common Divisor
      }
   }

   System.out.println("GCD is: " + numA);
}
}
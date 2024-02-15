package lessons;

import java.util.Scanner;

public class SumOfExcessForIf {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i;
      int sumExtra = -9999; // Assign sumExtra with 0 before your for loop

      for (i = 0; i < testGrades.length; ++i) {
         testGrades[i] = scnr.nextInt();
      }
      // correct sumExtra to 0
      sumExtra = 0;
      // Loop through each grade in the testGrades array
      for (i = 0; i < testGrades.length; ++i) {
    	 // Check if the current grade is greater than 100 
         if (testGrades[i] > 100) {
        	// Add the excess amount over 100 to sumExtra 
            sumExtra += testGrades[i] - 100;
         }
      }

      System.out.println("sumExtra: " + sumExtra);
   }
}
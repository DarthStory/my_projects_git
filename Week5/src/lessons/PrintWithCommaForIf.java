package lessons;

import java.util.Scanner;

public class PrintWithCommaForIf {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] hourlyTemp = new int[NUM_VALS];
      int i;

      for (i = 0; i < hourlyTemp.length; ++i) {
         hourlyTemp[i] = scnr.nextInt();
      }
      // to go through each value in hourlyTemp array
      for (i = 0; i < hourlyTemp.length; ++i) {
         // Print the current element
         System.out.print(hourlyTemp[i]);
         
         // If this is not the last element, print a comma and space
         if (i < hourlyTemp.length - 1) {
            System.out.print(", ");
         }
      }
      System.out.println("");
   }
}

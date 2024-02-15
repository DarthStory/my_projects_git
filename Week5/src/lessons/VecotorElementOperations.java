package lessons;

import java.util.Scanner;

public class VecotorElementOperations {
   public static void main (String [] args) {
      // Declare a constant for the number of values in the arrays.
      final int NUM_VALS = 4;
      // Initialize an array named origList with space for NUM_VALS integers.
      int[] origList = new int[NUM_VALS];
      // Initialize another array named offsetAmount with space for NUM_VALS integers.
      int[] offsetAmount = new int[NUM_VALS];
      // Declare an integer variable i for use as a loop counter.
      int i;

      // Manually set the elements of the origList array to specific values.
      origList[0] = 20; // Set the first element to 20
      origList[1] = 30; // Set the second element to 30
      origList[2] = 40; // Set the third element to 40
      origList[3] = 50; // Set the fourth element to 50

      // Manually set the elements of the offsetAmount array to specific values.
      offsetAmount[0] = 5;  // Set the first element to 5
      offsetAmount[1] = 7;  // Set the second element to 7
      offsetAmount[2] = 3;  // Set the third element to 3
      offsetAmount[3] = 4;  // Set the fourth element to 4

      /* Your solution goes here */
      // Loop through each element of the arrays using the loop counter i.
      for (i = 0; i < NUM_VALS; ++i) {
         // Add the current element of origList to the corresponding element of offsetAmount
         // and store the result in the variable sum.
         int sum = origList[i] + offsetAmount[i];
         // Print the sum followed by a space, without moving to a new line.
         System.out.print(sum + " ");
      }

      // Print a newline character to ensure the output is neatly formatted
      // and does not run on the same line as any future output.
      System.out.println("");
   }
}

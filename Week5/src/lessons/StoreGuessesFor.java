package lessons;

import java.util.Scanner;

public class StoreGuessesFor {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_GUESSES = 3;
      int[] userGuesses = new int[NUM_GUESSES];
      int i;

      for (i = 0; i < NUM_GUESSES; ++i) {
         userGuesses[i] = scnr.nextInt(); // Read an integer and store it in the array
      }

      for (i = 0; i < userGuesses.length; ++i) {
         System.out.print(userGuesses[i] + " "); // Print the stored integers
      }
   }
}
package week4;

import java.util.Scanner;

public class SimonSaysForIfComparison {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      // Read patterns from user input
      simonPattern = scnr.next();
      userPattern  = scnr.next();

      // Iterate through the characters of the strings
      for (i = 0; i < simonPattern.length(); i++) {
         if (simonPattern.charAt(i) == userPattern.charAt(i)) {
            userScore++; // Increment score for a match
         } else {
            break; // Exit loop on a mismatch
         }
      }

      System.out.println("userScore: " + userScore);

      // No need for return statement at the end of void method in Java
   }
}
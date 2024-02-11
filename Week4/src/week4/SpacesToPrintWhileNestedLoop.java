package week4;

import java.util.Scanner;
public class SpacesToPrintWhileNestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();

       // Outer loop for numbers from 0 to userNum
       for (i = 0; i <= userNum; i++) {
         // Inner loop for printing spaces 
         for (j = 0; j < i; j++) { 
            System.out.print(" ");
         }
         // Print the number after the spaces and go to the next line
         System.out.println(i); 
      }

   }
}
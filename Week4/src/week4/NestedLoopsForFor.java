package week4;

import java.util.Scanner;
public class NestedLoopsForFor {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      // Iterate through each row
      for (currentRow = 1; currentRow <= numRows; currentRow++) {
         // Iterate through each column
         for (currentColumnLetter = 'A'; currentColumnLetter < 'A' + numColumns; currentColumnLetter++) {
            // Print the seat (e.g., 1A) followed by a space
            System.out.print(currentRow + "" + currentColumnLetter + " "); 
         }
      }

      System.out.println("");
   }
}
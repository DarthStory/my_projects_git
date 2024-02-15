package lessons;

import java.util.Scanner;

public class ArraysKeyValue {
   public static void main (String [] args) {

      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      int[] itemsList = new int[SIZE_LIST];
      int i;

      keysList[0] = 13;
      keysList[1] = 47;
      keysList[2] = 71;
      keysList[3] = 59;

      itemsList[0] = 12;
      itemsList[1] = 36;
      itemsList[2] = 72;
      itemsList[3] = 54;

      /* Your solution goes here */
      for (i = 0; i < SIZE_LIST; ++i) {
         if (keysList[i] > 40) {
            // If the current element in keysList is greater than 40,
            // print the corresponding value from itemsList followed by a space.
            System.out.print(itemsList[i] + " ");
         }
      }

      // This newline is for formatting purposes, to ensure the output ends cleanly.
      System.out.println("");
   }
}

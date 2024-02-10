package week4;

import java.util.Scanner;

public class InsectGrowthWhile {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numInsects;

      numInsects = scnr.nextInt(); // Must be >= 1

      while (numInsects >=1 && numInsects < 200) {
         System.out.print(numInsects + " ");
         numInsects = numInsects * 2;
      }
      

   }
}
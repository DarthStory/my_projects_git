package lessons;

import java.util.Scanner;

public class CourseGradePrinterArray {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      // Print elements forward
      for (i = 0; i < courseGrades.length; ++i) {
         System.out.print(courseGrades[i] + " ");
      }
      // Move to the next line after printing all elements
      System.out.println(); 

      // Print elements backward
      // i = courseGrades.length - 1 means that no matter the length, 
      // the array is the "length - 1"
      for (i = courseGrades.length - 1; i >= 0; --i) {
         System.out.print(courseGrades[i] + " ");
      }
      // Move to the next line after printing all elements
      System.out.println(); 
    	  
      }

   }
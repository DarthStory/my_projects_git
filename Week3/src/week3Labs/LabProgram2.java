package week3Labs;

// find the lowest number and print out that number. 

import java.util.Scanner;

public class LabProgram2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int red;
      int green;
      int blue;
      int smallest;
      
      red = scnr.nextInt();
      green = scnr.nextInt();
      blue = scnr.nextInt();
      
      // find the smallest of the 3 inputs
      if (red <= green && red <= blue) {
    	  smallest = red;
      }
      else if (green <= red && green <= blue) {
    	  smallest = green;
      }
      else {
    	  smallest = blue;
      }
      System.out.println(smallest);
   }
}

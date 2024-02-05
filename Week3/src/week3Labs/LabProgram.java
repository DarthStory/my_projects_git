package week3Labs;

// take gray out of RGB. 

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner color = new Scanner(System.in);
      int red;
      int green;
      int blue;
      int smallest;
      
      red = color.nextInt();
      green = color.nextInt();
      blue = color.nextInt();
      
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
      
      // take the smallest and subtract from each input to take out gray
      red = red - smallest;
      green = green - smallest;
      blue = blue - smallest;
     

      System.out.print(red);
      System.out.print(" ");
      System.out.print(green);
      System.out.print(" ");
      System.out.println(blue);
   }
}

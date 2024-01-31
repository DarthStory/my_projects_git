package labProgram;

import java.util.Scanner;

public class RedBalloon {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isRed;
      boolean isBalloon;

      isRed = scnr.nextBoolean();
      isBalloon = scnr.nextBoolean();

      if (isBalloon && !isRed) {
         System.out.println("Balloon");
      }
      else if  (isBalloon && isRed) {
         System.out.println("Red balloon");
      }
      else {
         System.out.println("Not a balloon");
      }

   }
}
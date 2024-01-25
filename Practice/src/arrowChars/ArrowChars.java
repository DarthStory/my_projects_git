package arrowChars;

import java.util.Scanner;

public class ArrowChars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char bodyChar;
      char headChar;

      System.out.print("Enter two characters: ");
      bodyChar = scnr.next().charAt(0);
      headChar = scnr.next().charAt(0);

      // Output arrow body then head
      System.out.print(bodyChar);
      System.out.print(bodyChar);
      System.out.print(bodyChar);
      System.out.println(headChar);
   }
}
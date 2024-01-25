package gettingInputChar;

import java.util.Scanner;

public class GettingInputChar{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userChar;

      System.out.print("Type a character to use: ");
      userChar = scnr.next().charAt(0);

      System.out.println(userChar + " " + userChar);
      System.out.println(" " + userChar);
      System.out.println("" + userChar + userChar + userChar);
   }
}
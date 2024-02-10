package week4;

import java.util.Scanner;

public class DomainNamePrinterNestedWhile {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      char letter1;
      char letter2;

      System.out.println("Two-letter domain names:");

      letter1 = '!';
      while (letter1 <= '~') {
         letter2 = '!';
         while (letter2 <= '~') {
            System.out.println("" + letter1 + "" + letter2 + ".com");
            
            // you can advance "char" characters
            ++letter2;
         }
         ++letter1;
      }
   }
}
package extractUsername;


//Getting the username from an email address. 

import java.util.Scanner;

public class ExtractUsername {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      String emailText;
      int atSymbolIndex;
      String emailUsername;

      System.out.print("Enter email address: ");
      emailText = scnr.nextLine();
      
      // Detects the @ symbol
      atSymbolIndex = emailText.indexOf('@');
      // If no @ symbol
      if (atSymbolIndex == -1) {
         System.out.println("Address is missing @");
      }
      // If there is an @ symbol, get the input before the symbol
      // starting at placement "0" and everything upto the @ symbol
      else {
         emailUsername = emailText.substring(0, atSymbolIndex);
         System.out.println("Username: " + emailUsername);
      }
   }
}
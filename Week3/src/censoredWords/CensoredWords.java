package censoredWords;
import java.util.Scanner;


// Use to detect a String, and replace

public class CensoredWords {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;

      userInput = scnr.nextLine();
      int userInputDarn;
      
      
      userInputDarn = userInput.indexOf("darn");
      if (userInputDarn == -1) {
      System.out.println(userInput);
      }
      else {
      System.out.println("Censored");
      }
      

   }
}
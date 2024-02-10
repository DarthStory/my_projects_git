package week4;

import java.util.Scanner;

/* Program that has a conversation with the user. 
   Uses a if-else statements and a random number (sort of) 
   to mix up the program's responses. */

public class ConversationWhileIfElseIf {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int randNum;       // Random number 0 to 3
      String userText;      // User input

      // shows a different structure that can be used for starting output to user
      System.out.println("Tell me something about yourself.");
      System.out.println("You can type \"Goodbye\" at anytime to quit.\n");
      System.out.println();
      System.out.print("> ");

      userText = scnr.nextLine();
      // while (not true)
      while (!userText.equals("Goodbye")) {
    	 // this random takes the length and uses the remainder to determine which
    	 // "if" statement gets used. 
         randNum = userText.length() % 4; // "Random" num. %4 ensures 0-3
         System.out.println();
         

         if (randNum == 0) {
            System.out.println("Please explain further.");
         }
         else if (randNum == 1) {
            System.out.println("Why do you say: \"" + userText + "\"?");
         }
         else if (randNum == 2) {
            System.out.println("I don't think that's right.");
         }
         else if (randNum == 3) {
            System.out.println("What else can you share?");
         }
         else {
            System.out.println("Uh-oh, something went wrong. Try again.");
         }
         // after one "if" has been determined, this is the output after
         System.out.println();
                   System.out.print("> ");
         userText = scnr.nextLine();
      }
      // after while is true, and the user says Goodbye, goodbye does not work
      System.out.println();

      System.out.println("It was nice talking with you. Goodbye.");
   }
}
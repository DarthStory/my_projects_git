package greetingMaker;

/* Strings are considered IMMUTABLE, meaning they cannot be changed. 
 * Thus, a programmer cannot directly modify a String's characters, 
 * and the above operations don't change the string. Ex: If userText 
 * is "run", then after userText.concat("ning") (which returns 
 * "running"), userText is still "run". To change a variable's string, 
 * a programmer can assign the variable with the result of an 
 * operation. Ex: if userText is "run", then: 
 * 
 * userText = userText.concat("ning");
 * 
 * assigns userText with "running".
*/


import java.util.Scanner;

public class GreetingMaker {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
      String greetingText;
      
      System.out.print("Enter name: ");
      userName = scnr.nextLine();

      // Combine strings using +
      greetingText = "Hello " + userName;
      
      // Append a period (could have used +)
      greetingText = greetingText.concat(".");
      System.out.println(greetingText);
      
      // Insert Mr/Ms before user's name
      greetingText = "Hello Mr/Ms ";
      greetingText = greetingText.concat(userName);
      greetingText = greetingText.concat(".");
      System.out.println(greetingText);
      
      // Replace occurrence of "Darn" by "@$#"
      greetingText = greetingText.replace("Darn", "@$#");
      System.out.println(greetingText);
   }
}
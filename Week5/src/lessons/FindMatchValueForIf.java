package lessons;

//Import the Scanner class to read input from the standard input stream
import java.util.Scanner;

//Define the public class named FindMatchValueForIf
public class FindMatchValueForIf {
 // Main method - entry point of the program
 public static void main (String [] args) {
     // Create a Scanner object to read input
     Scanner scnr = new Scanner(System.in);

     // Constant for the number of user values to be read
     final int NUM_VALS = 4;
     // Array to store user input values
     int[] userValues = new int[NUM_VALS];
     // Variable for loop control
     int i;
     // Variable to store the value to match against user inputs
     int matchValue;
     // Variable to count the number of times matchValue is found in userValues
     int numMatches = 0; // Correctly initialize numMatches to 0

     // Read the match value from user input
     matchValue = scnr.nextInt();
     // Loop to read NUM_VALS user inputs and store them in userValues array
     for (i = 0; i < userValues.length; ++i) {
         userValues[i] = scnr.nextInt();
     }

     // Reset numMatches to 0 to start counting matches
     numMatches = 0;
     // Loop through the userValues array
     for (i = 0; i < userValues.length; ++i) {
         // If the current element matches matchValue
         if (userValues[i] == matchValue) {
             // Increment numMatches by 1
             numMatches++; 
         }
     }

     // Print the matchValue and the number of matches found
     System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
 }
}
// Define the package name for organization and to avoid naming conflicts.
package lessons;

// Import the Scanner class to read user input from the console.
import java.util.Scanner;

// Declare the public class named PostageCalcMultipleArray.
public class PostageCalcMultipleArray {
   // Main method - the entry point of the program.
   public static void main (String [] args) {
      // Create a Scanner object to read input from the standard input stream.
      Scanner scnr = new Scanner(System.in);
      
      // Array of letter weights in ounces. Each element represents a weight limit.
      double[] letterWeights = {1.0, 2.0, 3.0, 3.5, 4.0, 5.0, 6.0,
                                7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0};
      
      // Array of postage costs in cents for each corresponding weight in the letterWeights array.
      int[] postageCosts = {49, 70, 91, 112, 161, 182, 203,
                            224, 245, 266, 287, 308, 329, 350};
      
      // Variable to store the user's letter weight input.
      double userLetterWeight;
      
      // Boolean flag to indicate if a matching weight (and thus postage cost) has been found.
      boolean foundWeight;
      
      // Loop control variable.
      int i;
 
      // Prompt the user to enter the letter weight.
      System.out.print("Enter letter weight (in ounces): ");
      userLetterWeight = scnr.nextDouble();
 
      // Initially, no matching weight has been found, so set foundWeight to false.
      foundWeight = false;
 
      // Iterate over the letterWeights array to find the smallest letter weight that is
      // greater than or equal to the user's letter weight.
      for (i = 0; (i < letterWeights.length) && (!foundWeight); ++i) {
         // If the user's letter weight is less than or equal to the current weight in the array,
         // a matching postage cost is found.
         if( userLetterWeight <= letterWeights[i] ) {
            // Set foundWeight to true to indicate a match has been found.
            foundWeight = true;
            // Output the postage cost for the found weight.
            System.out.print("Postage for USPS first class mail is ");
            System.out.print(postageCosts[i]);
            System.out.println(" cents");
         }
      }
 
      // If no matching weight was found (the letter is too heavy), inform the user.
      if( !foundWeight ) {
         System.out.println("Letter is too heavy for USPS " +
                            "first class mail.");
      }
   }
}

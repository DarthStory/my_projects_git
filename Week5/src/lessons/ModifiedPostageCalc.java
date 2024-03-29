package lessons;

import java.util.Scanner;

public class ModifiedPostageCalc {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Weights in ounces
      double[] letterWeights = {1.0, 2.0, 3.0, 3.5, 4.0, 5.0, 6.0,
                                7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0};
      // Costs in cents (usps.com 2017)
      int[] postageCosts = {49, 70, 91, 112, 161, 182, 203,
                            224, 245, 266, 287, 308, 329, 350};
      double userLetterWeight;
      boolean foundWeight;
      int i;

      // Prompt user to enter letter weight
      System.out.print("Enter letter weight (in ounces): ");
      userLetterWeight = scnr.nextDouble();

      // Postage costs is based on smallest letter weight greater than
      // or equal to mailing letter weight
      foundWeight = false;

      for (i = 0; i < letterWeights.length; ++i) {
         if( userLetterWeight <= letterWeights[i] ) {
            foundWeight = true;
            System.out.print("Postage for USPS first class mail is ");
            System.out.print(postageCosts[i]);
            System.out.println(" cents");
            
            // Check if there is a next higher weight in the array
            if (i + 1 < letterWeights.length) {
                System.out.print("The next higher weight is ");
                System.out.print(letterWeights[i + 1]);
                System.out.print(" with a cost of ");
                System.out.print(postageCosts[i + 1]);
                System.out.println(" cents");
            }
            break; // Exit the loop after finding the match and optionally printing the next higher weight
         }
      }

      if( !foundWeight ) {
         System.out.println("Letter is too heavy for USPS first class mail.");
      }
   }
}

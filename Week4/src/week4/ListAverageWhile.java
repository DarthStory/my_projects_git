package week4;

import java.util.Scanner;

//Outputs average of list of positive integers
//List ends with 0 (sentinel)
//Ex: 10 1 6 3 0  yields (10 + 1 + 6 + 3) / 4, or 5

public class ListAverageWhile {
public static void main(String [] args) {
   Scanner scnr = new Scanner(System.in);
   int currValue;
   int valuesSum;
   int numValues;
   
   valuesSum = 0;
   numValues = 0;
   
   currValue = scnr.nextInt();
   // will keep requiring number until you hit 0, but without stating that
   // it is kind of confusing
   while (currValue > 0) { // Get values until 0 (or less)
	  // simplified "valueSum = valueSum + currValue;"
      valuesSum += currValue;
      numValues = numValues + 1;
      currValue = scnr.nextInt();
   }

   System.out.println("Average: " + (valuesSum / numValues));
}
}
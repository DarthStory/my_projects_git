package week4;

import java.util.Scanner;

public class CountUpLoop {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int currPower;
     char userChar;
     
     // current power is 2, so printout is 2
     currPower = 2;
     // to start the while loop, they make the char 'y'
     userChar = 'y';
 
     // as long as they keep hitting y, the power level will double
     while (userChar == 'y') {
        System.out.println(currPower);
        currPower = currPower * 2;
        userChar = scnr.next().charAt(0);
     }
 
     System.out.println("Done");
  }
}
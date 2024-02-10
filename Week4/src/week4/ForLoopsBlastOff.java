package week4;

import java.util.Scanner;

public class ForLoopsBlastOff {
   public static void main(String[] args) {
      int userNum;
      int i;

      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();

      System.out.println("Ready!");
      
      for (i = userNum; userNum > 0; i = i -1) {
    	  System.out.println(userNum);
    	  userNum = i - 1;
      }
      System.out.println("Blastoff!");

   }	
}

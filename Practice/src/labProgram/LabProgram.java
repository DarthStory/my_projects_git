package labProgram;
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int userNum;
      int x;
      
      System.out.print("Enter a number: ");
      Scanner scnr = new Scanner(System.in);
      userNum = scnr.nextInt();
      System.out.println(userNum);
      System.out.print("Enter a number for x: ");
      x = scnr.nextInt();
      System.out.println(x);
      
      System.out.println(userNum = (userNum / x));
      System.out.println(userNum = (userNum / x));
      System.out.println(userNum = (userNum / x));
           
      
   }
}
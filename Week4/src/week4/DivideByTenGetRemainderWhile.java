package week4;


import java.util.Scanner;

public class DivideByTenGetRemainderWhile {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int userNum;
    
     userNum = scnr.nextInt();
     // you can use this to spell out the number in each place. 
     while (userNum > 0) {
        System.out.println(userNum % 10);
        userNum = userNum / 10;
     }
  }
}
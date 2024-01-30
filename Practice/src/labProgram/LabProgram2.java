package labProgram;
import java.util.Scanner;

public class LabProgram2 {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   double mG = 0.00;
	   double dG = 0.00;
	   double dM = 0.00;
	   double yourValue = 0.00;
	   
	   
	   
	   mG = scnr.nextDouble();
	   dG = scnr.nextDouble();
	   dM = dG / mG;
	   yourValue = dM * 20;
	   System.out.printf("%.2f", yourValue);
	   System.out.print(" ");
	   yourValue = dM * 75;
	   System.out.printf("%.2f", yourValue);
	   System.out.print(" ");
	   yourValue = dM * 500;
	   System.out.printf("%.2f", yourValue);
	   System.out.println();
	   
   }
}

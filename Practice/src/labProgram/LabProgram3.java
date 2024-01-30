package labProgram;

import java.util.Scanner;

public class LabProgram3 {
   public static void main(String[] args) {
   
	   Scanner scnr = new Scanner(System.in);
		  double womanCalories = 0.00;
	      double menCalories = 0.00;
	      double age;
	      double mAge;
	      double wAge;
	      double weight;
	      double mWeight;
	      double wWeight;
	      double heartRate;
	      double mHeartRate;
	      double wHeartRate;
	      double time;
	      double yourValue = 0.00;
	      
	      age = scnr.nextDouble();
	      wAge = age * 0.074;
	      mAge = age * 0.2017;
	      weight = scnr.nextDouble();
	      wWeight = weight * 0.05741;
	      mWeight = weight * 0.09036;
	      heartRate = scnr.nextDouble();
	      wHeartRate = heartRate * 0.4472;
	      mHeartRate = heartRate * 0.6309;
	      time = scnr.nextDouble();
	      	      
	      womanCalories = (((wAge - wWeight + wHeartRate - 20.4022) * time) / 4.184);
	      System.out.print("Women: ");
	      System.out.printf("%.2f", womanCalories);
	      System.out.println(" calories");
	      
	      menCalories = (((mAge + mWeight + mHeartRate - 55.0969) * time) / 4.184);
	      System.out.print("Men: ");
	      System.out.printf("%.2f", menCalories);
	      System.out.println(" calories");
	      

   }
}
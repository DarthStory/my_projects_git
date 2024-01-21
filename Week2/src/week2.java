import java.util.Scanner;

public class week2 {

	public static void main(String[] args) {
		 int myAgeInt;  //declare the variable for Age
	      
	      Scanner myInput = new Scanner( System.in );
	      
	      System.out.println("Welcome to the Age Program.");
	      
	      System.out.println("Please enter your current age: ");
	      
	      myAgeInt = myInput.nextInt();
	       
	      System.out.println("The age that you have entered is "+ myAgeInt);
	      
	}

}

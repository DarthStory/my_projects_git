package labProgram;

import java.util.Scanner;

public class DetectWord {
	public static void main (String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      String userString;

	      userString = scnr.next();

	      if (userString.compareTo("Quit") == 0) {
	    	  System.out.println("Goodbye");
	      }
	      else {
	    	  System.out.println("Hello");
	      }
	      }

	   }

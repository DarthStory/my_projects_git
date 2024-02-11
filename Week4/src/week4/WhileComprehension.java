package week4;

public class WhileComprehension {

	public static void main(String[] args) {

		int mult = 0;
		int a = 4;
		int b = 5;
		int c = 20;
		int z;
		
		// While 4 is less than 10
		while (a < 10) {
			// multiply 4 x 5
			mult = b * a;
			// if 4 x 5 is > 20, stop
			if (mult > c) {
		      break;
			}
			// then add 4 by 1
			a = a + 1;
			// first iteration 4 x 5 is 20, so "multi" is not greater than 20
			// second iteration, since it was not greater, you added 1 as it 
			// did not break the while loop
			// now it is 5 x 5 which is 25, so "multi" is greater than 20 so 
			//break
			// meaning z = a which is 5 now
		}
		// "z" = the outcome IF a is greater than 20
		z = a;
	System.out.println(z);	
	}
	
}

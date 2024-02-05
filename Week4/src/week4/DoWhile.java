package week4;

public class DoWhile {

	public static void main(String[] args) {
		
		// Declare variable
		int i = 1;
		// execution of the statement happens, then it checks the while statement. 
		do {
			System.out.println("Hello " + i);
			i++;
		} while(i <= 3);
		// now that the while loop is false, it exits the loop.
		System.out.println("Do While is over");
		
	}
}

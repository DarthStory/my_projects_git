package week4;

public class LessThanOneHundred {

	public static void main(String[] args) {
		
		int myValue = 0;
		
		while (myValue < 100) {
			if (myValue % 4 == 0) {
				System.out.println(myValue);
		}
		myValue++;
	}
		int myBadValue = 0;
		
		do {
			System.out.println("This will run at least once.");
		} while (myBadValue != 0);
	}
}

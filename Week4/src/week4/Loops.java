package week4;

public class Loops {

	private static String[] months =
	{"January", "February", "March", "April", 
		"May", "June", "July", "August", "September", 
		"October", "November", "December"};
	public static void main(String[] args) {
		
		
		// ITERATION LOOP, For i loop, "int i = 0" starting point of the loop, if i < the length 
		// of the array, it will keep going, once at the end it will stop. i++ 
		// tells it to progress forward in the list
//		for (int i = 0; i < months.length; i++) {
//			System.out.println(months[i]);
//		}
		
		
		
		// Foreach loop, not bothering with the index, just one value at a time
//		for (String month : months) {
//			System.out.println(month);
//		}
		
		
		
		// While loop
//		int counter = 0;
//		while (counter < months.length) {
//			System.out.println(months[counter]);
//			counter ++;
//		}
		
		
		// do while loop
		int counter = 0;
		do {
			System.out.println(months[counter]);
			counter ++;
			
			if (counter == 9) {
				break;
			}
		} while (counter < months.length);
	}
}

package lessons;

import java.util.Scanner;

public class PracticeMethods {
	public static void main(String[] args) {
		// printing message
		System.out.println("message1");
		// printing out the called method
		System.out.println(sum(1,2));
		// printing out the called method plus the called method
		System.out.println(sum(1,2) + sum(3,5));
		// calling the method but doing nothing with it
		sum(1,2);
		// printing message
		System.out.println("message2");
		// calls method, since the method prints out, no need to ask it to
		sayHi();
		// calls method, inputs a parameter
		sayHi("David");
		System.out.println("Hi " + getName());
		System.out.println(("you are " + getAge() + " years old."));
		
		
		
		
	}


	// public (can be called outside of this class)
	// static (able to call this method from within the main method)
	// type of the method (int)
	// name of the method (sum)
	// entered parameters
	public static int sum(int x, int y) {
		int sum = x + y;
		// return exits the method and returns the name of the method
		return sum;
	}
//	public static int sum(int x, int y) {
//		return x + y;
//	}
	public static void sayHi() {
		System.out.println("Hi");
	}
	public static void sayHi(String name) {
		System.out.println("Hi " + name);
	}
	public static String getName() {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		return name;
		// if you want to use an object immediately, one time, you can write it like this
//		return new Scanner(System.in).nextLine();
	}
	public static int getAge() {
		return new Scanner(System.in).nextInt();
	}
}

package week4;

import java.util.Scanner;

public class LoopPracticeAverages {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			int sum = 0;
			int num = 0;
			int val = 0;
			int avg;
			
			while (val > -1) {
				System.out.println("Give a number: ");
				val = scnr.nextInt();
				sum += val;
				num = num +1;
			avg = sum / num;
			System.out.println(sum);
			System.out.println(num);			
			System.out.println("Your avg. is "+ avg);
		}
	}
}

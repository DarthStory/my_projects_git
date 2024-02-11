package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PickANumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = 0; // Initialize number to ensure it has a value before first check

        do {
            System.out.println("Pick a number between 1 and 10");
            try {
                number = scnr.nextInt();
                if (number < 1 || number > 10) {
                    System.out.println("That is not a valid number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid number. Please try again.");
                scnr.next(); // Consume the invalid input
            }
        } while (number < 1 || number > 10);

        System.out.println("You chose " + number);
    }
}
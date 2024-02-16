package week4;

import java.util.Scanner;
public class CriticalThinkingDrCooper {
    public static void main(String[] args) {
        //declarations
        float sum   = 0;
        float minimum = 0;
        float maximum = 0;
        float value   = 0;
        int   count   = 0;

        Scanner scanner = new Scanner(System.in);

        while(count < 5) {
            System.out.println("Please enter a floating point numbers: ");
            value = scanner.nextFloat();
            sum += value;
            // makes the first value both min and max
            if(count == 0) {
                minimum = value;
                maximum = value;
            }
            // after it moves to this
            else {
            	// takes the value and if it is greater than max, it assigns it
                if(value > maximum) {
                    maximum = value;
                }
                // takes the value and if it is less than min, it assigns it
                else if(value < minimum) {
                    minimum = value;
                }
            }
            count++;

        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/5);
        System.out.println("The maximum is " + maximum);
        System.out.println("The minimum is " + minimum);
        System.out.println("20% interest is " + sum * .20);
    }
}
package practice;

//Java program to insert an element in
//an array and then sorting it.

//Importing util files
import java.util.*;

public class Gfg {

 // Main function
 public static void main(String args[]) throws Exception
 {

     // Given number
     int given_number = 1;

     // Array
     int array[] = { 6, 7, 8, 2, 3, 4, 5, 9, 10 };

     // Creating new array with increased size
     int new_array[] = new int[array.length + 1];

     // Copying elements from one array to another
     for (int i = 0; i < array.length; i++) {
         new_array[i] = array[i];
     }

     // Adding new element
     new_array[new_array.length - 1] = given_number;

     // Sorting new array
     Arrays.sort(new_array);

     // print array
     for (int i = 0; i < new_array.length; i++)
         System.out.print(new_array[i] + " ");
 }
}
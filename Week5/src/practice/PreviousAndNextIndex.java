package practice;

//Java program to get Previous and
//next index using ListIterator

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

class PreviousAndNextIndex {

 public static void main(String[] args)
 {
     // create empty ArrayList
     ArrayList<Integer> arrList
         = new ArrayList<Integer>();
    
     // add elements to the ArrayList
     arrList.add(5);
     arrList.add(10);
     arrList.add(15);
     arrList.add(20);
     arrList.add(25);
     arrList.add(30);

     // print the initial list
     System.out.println("Initial arraylist =>"
                        + arrList);

     // initializing ListIterator
     ListIterator<Integer> iterator
         = arrList.listIterator();

     // initially iterator is the beginning so
     // previousIndex() will return -1
     System.out.println("previous index =>"
                        + iterator.previousIndex());

     // from -1 moving iterator to the 1st index
//     iterator.next();
//     iterator.next();

     // now iterator is at 1st index 
     // so nextIterator() will return 2
     System.out.println("Next index =>"
                        + iterator.next());
//     iterator.next();
     System.out.println("Next index =>"
    		 			+ iterator.next());
     
 }
}
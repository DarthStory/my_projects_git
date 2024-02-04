package practiceArray;

import java.util.ArrayList;
import java.util.Arrays;


public class PracticeArray {

	public static void main(String[] args) {
		
	//[0][1][2][3]
		String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
		//Arrays are fixed.
		//Arrays can hold any data type and also objects.
		//ArrayLists are dynamic.
		//ArrayLists cannot hold primitive data types (int,byte,etc.).
		ArrayList<String> friendsArrayList =  
				new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
		
		//In order to get the element we want. 
		System.out.println(friendsArray[0]);
		System.out.println(friendsArrayList.get(1));
		//In order to get the element from the list. You have to do a method call (get).
		
		//length is a field
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size());
		//size is a method call, not a field. 
		
		//you cannot add to an array.
		//you can add to a list. add is the method.
		friendsArrayList.add("Mitch");
		System.out.println(friendsArrayList.get(4));
		
		//Change element in an Array
		friendsArray[0] = "Carl";
		System.out.println(friendsArray[0]);
		friendsArrayList.set(0, "Carl");
		System.out.println(friendsArrayList.get(0));
		//Change element in a list
		
		//Remove an element, can't do it with an Array
		friendsArrayList.remove("Chris");
		System.out.println(friendsArrayList.get(1));
		
		//Print
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);
		
				
	}
}

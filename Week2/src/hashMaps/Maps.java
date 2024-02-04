package hashMaps;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// Have to use wrapper classes, i.e "Integer" instead of "int"
		// Maps is a collection of key, value pairs. 
		HashMap<String, Integer> empIds = new HashMap<>();
		// "put" puts the variables into the map
		empIds.put("David", 200);
		empIds.put("Paul", 190);
		empIds.put("Ale", 140);
		
		System.out.println(empIds);
		
		// "gets" the value associated with the key
		System.out.println(empIds.get("David"));
		
		// queries if a key is in the map
		System.out.println(empIds.containsKey("Paul"));
		
		// queries if a value is in the map, (true, false)
		System.out.println(empIds.containsValue(140));
		System.out.println(empIds.containsValue(29));
		
		// "puts value in for the key input and prints
		System.out.println(empIds.put("David", 500));
		
		// 2 lines for the same outcome
		empIds.put("David", 900);
		System.out.println(empIds);
		
		// replaces the value if the key exists
		empIds.replace("David", 250);
		System.out.println(empIds);
		
		// no key exists, so nothing is replaced		
		empIds.replace("Craimer", 9000);
		System.out.println(empIds);
		
		// if absent, it puts it in
		empIds.putIfAbsent("John", 777);
		System.out.println(empIds);
		
		// removes the key if it exists
		empIds.remove("John");
		System.out.println(empIds);
		
		
		
	}

}

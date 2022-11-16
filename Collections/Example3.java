package collections;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		// Map
		// Create a map
		
		HashMap <Integer, String> hm = new HashMap<>();
		
		// insert an key value pair
		
		hm.put(1, "Porkodi");
	hm.put(2,  "Mohd");
	hm.put(3, "Sahista");
	
	System.out.println(hm);
	// Update the value key 1 as "Venkatesh"
	
	hm.put(1, "Venkatesh");
	System.out.println(hm);
	
	// key -> values
	// you can access values only using the key
	
	for (Integer key : hm.keySet()) {
		System.out.println(key + " -> " + hm.get(key));
	}
	
	// to check whether a key present in the map or not
	
	System.out.println(hm.containsKey(1));
	System.out.println(hm.containsKey(4));
	
	
hm.remove(1);
	
System.out.println(hm);


hm.replace(2, "Porkodi");  


System.out.println(hm);

hm.put(3, "Venkatesh");

System.out.println(hm);

	}

}

package collections;

import java.util.HashSet;

public class Example2 {
	
	public static void main(String[] args) {
		
		// hash set
		// 1. create a hash set
		HashSet<Integer> hs = new HashSet<>();
		
		//2. how do you insert a element to the hash set
		
		hs.add(12);
		hs.add(12);
		hs.add(23);
		hs.add(45);
		
		// not indexed, not in any order 
		
		System.out.println(hs);
		
	    System.out.println(hs.size());
	    
	    //how we replace an element
	    // 12 -> 89
	    
	     // remove 12 and add 89
	    
	    hs.remove(12);
	    
		System.out.println(hs);
		
		hs.add(89);
		
		System.out.println(hs);
 	}

}

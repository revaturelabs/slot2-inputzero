package interviewquestions;

import java.util.HashSet;
import java.util.LinkedHashSet;

// apple -> remove duplicates from the string
// which collection doesn't contain duplicate
// set 
// aple
// maintain the order  (indexes/ insertion)
// linked hashset
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s = "apple";
		//traversing the string using for loop
		//nested for loop then compare
		// if its equals we remove that it
		
		//by using linkedhashset
		
		// set -> unique values
		// if we insert these char into unique
		
		LinkedHashSet<Character>  lhs = new LinkedHashSet<>();
		
		for(int i = 0 ; i < s.length(); i++) {
			Character c = s.charAt(i);
			lhs.add(c);
		}
		
		//printing the hash set
		for (Character c : lhs) {
			System.out.println(c);
		}
	}

}

package interviewquestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharInAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string: ");
		String s = sc.nextLine();

		s = s.toLowerCase();
		
		//<key, value> -> <character, its count> -> <Character, Integer>

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		
		//go thro each char in a string
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i); //getting a char
             
			//System.out.println("getting a char: " + c);
			if (map.containsKey(c)) {
				int prevCount = map.get(c);
				map.put(c, ++prevCount);
				//System.out.println("Character is there so updating asmap.put("+  c + ", " + prevCount + ")");
			} else {
				map.put(c, 1);
				//System.out.println("Character is not there so updating as map.put("+  c + ", " + 1+ ")");
			}
			
			//System.out.println("now hash map: " + map);
		}

		for (Character c : map.keySet()) {

			// value = map.get(key)
			System.out.println(c + " -> " + map.get(c));

		}

		// first repeated char
		// occurence/ count > 1
		//java is awesome -> a, s, e
		// its comes first -> a

		for (Character c : map.keySet()) {

			if (map.get(c) > 1) {
				System.out.println("First Repeated Character is  " + c);
				break;
			}
		}

		// first non repeated char
		// occurence == 1
		for (Character c : map.keySet()) {
			if (map.get(c) == 1) {
				System.out.println("First Non-repeated Character is  " + c);
				break;
			}
		}
	}

}

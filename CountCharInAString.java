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

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (map.containsKey(c)) {
				int prevCount = map.get(c);
				map.put(c, ++prevCount);
			} else {
				map.put(c, 1);
			}
		}

		for (Character c : map.keySet()) {

			System.out.println(c + " -> " + map.get(c));

		}

		// first repeated char
		// occurence > 1

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

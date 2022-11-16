package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSet {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(12);
		al.add(23);
		al.add(45);
		al.add(75);
		al.add(23);//duplicate

		System.out.println("ArrayList");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(23);
		hs.add(45);
		hs.add(75);
		hs.add(23);//duplicate
		
		// Set doesn't allow you to access elements using index
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(hs.get(i));
//		}
		
		System.out.println("HashSet");
		for (Integer i : hs) {
			System.out.println(i);
		}
	}
}

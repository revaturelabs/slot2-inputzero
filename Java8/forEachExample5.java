package interfacesJava8;

import java.util.ArrayList;

public class forEachExample5 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		System.out.println("Just arraylist " + al);
		
		System.out.println("Using For loop");
		
		for (int i = 0 ;  i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Using for each loop");
		for (Integer i : al) {
			System.out.println(i);
		}
		
		System.out.println("using forEach method");
		
		//collection.forEach( //using lambada functions)
		//() -> line 1
		//() -> { line1; line2}

		al.forEach(i -> System.out.println(i));
		
		al.forEach(i -> System.out.println(i * 2));
		
		al.forEach(i -> System.out.println(i % 10));
	
		al.forEach(i -> {
			System.out.print("Hi!! ");
			System.out.println(i);
		});
	}

}

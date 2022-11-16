package collections;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		//ArrayList
		//1. How do you create an arraylist?
		
		ArrayList<Integer>  al = new ArrayList<>();
		
		//2. How do you add a element to the list
		
		al.add(12);
		al.add(13);
		
		//3. How to access an element  in the index -> 1 (ArrayList index starts with 0)
		
		System.out.println(al.get(1));
		
		System.out.println(al);
		
		//4. How can i insert/add 35 to the index 1
		// 12, 13  ->  12, 35, 13
		al.add(1, 35);
		
		System.out.println(al);
		
		//5. replace 13 to 31
		
          // a. we have to know whether 13 is present
		//b. if 13 is present then in which index
		//c. by giving index i can replace using set methods
		
	int index = al.indexOf(13);
	
	System.out.println(" 13 is present at " + index);
	
	if( index == -1) {
		System.out.println(" 13 is not present in the arraylist");
	}else {
	
		al.set(index, 31);
		System.out.println(al);
	}
		
		
		//6. replace element in the index 0 to 55
		al.set(0, 55);
		
		System.out.println(al);
		
	}
}

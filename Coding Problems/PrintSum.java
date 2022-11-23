package interviewquestions;

import java.util.Scanner;

public class PrintSum {
	
	public static void main(String[] args) {
		
		
		
//		System.out.println((int) 'a'  - 96);
//		System.out.println((int) 'b'  - 96);
//		System.out.println((int) 'c'  - 96);
		
		
		//ASCII Value
		System.out.println((int) 'a');
		// a - 97
		// a - 1
		System.out.println((int) 'a' - 96);
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		
		int sum = 0;
		
		for (int i= 0; i< s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c  + " => " + ((int) c  - 96) );
			sum += (int) c  - 96;
		}
		
		System.out.println(sum);
	}

}

package interviewquestions;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fact = 1;
		for (int i = 2; i <=n ; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		
		System.out.println(fact(12));
	}
	
	
	public static int fact (int n) {
		if(n == 1)
			return 1;
		
		return n*fact(n-1);
	}

}

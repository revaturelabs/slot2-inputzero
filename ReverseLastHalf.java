package interviewquestions;

import java.util.Scanner;

public class ReverseLastHalf {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			String s = sc.next();
			
//			String j="";
//			
//			for(int i=s.length()/2;i<s.length();i++){
//			    char c=s.charAt(i);
//			    j=c+j;
//			}
//			//System.out.println(j);
//			System.out.println(s.substring(0,s.length()/2)+j);
			
			
			String firstHalf = s.substring(0, s.length()/2);
			
			String lastHalf = s.substring(s.length()/2);
			
			String revLastHalf = new StringBuilder(lastHalf).reverse().toString();
			
			System.out.println( firstHalf + revLastHalf);
		}
	}

package interviewquestions;
import java.util.Scanner;

public class RemoveSameCharacter {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		while(s.length() > 0) {
			int i = isSame(s);
			if( i == -1) {
				break;
			}		
			s = s.substring(0,i) + s.substring(i+2);
			System.out.println("i =  " + i + " s = " + s);
		}
			System.out.println("Output =  " + s);
	}
	
	public static int isSame(String s) {
		for(int i =0 ; i < s.length() -1 ; i ++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				return i;
			}
		}
		
		return -1;
	}

}

package interviewquestions;

public class ReplaceA {
	
	public static void main(String[] args) {
		
		String s = "apple";
		
		s = s.replace('a', '@');
		
		System.out.println(s);
		
		
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println(sb.reverse().toString());
		
		
		
	}

}

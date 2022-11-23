package interviewquestions;

public class ReplaceA {
	
	public static void main(String[] args) {
		
		String s = "apple";
		
		// replace any char in a given
		// replace methods
		
		s =  s.replace('a', '@');
		
		System.out.println(s);
		
		
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println(sb.reverse().toString());
		
		s = "apple";
		//replace apple "pp" "@"
		
		s = s.replace("pp" , "@");
		
		System.out.println(s);
		
		
		
	}

}

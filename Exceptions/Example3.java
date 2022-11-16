package exceptions;

public class Example3 {
	
// if exceptions occurs program stops not execution the code below
// if its handled, it executing all the remaining
// handling -> try and catch or throws

	public static void main(String[] args){
	
     divide(10,2);
     divide(23, 4);
     divide(17, 0); // exception throwm
     divide (18,3);
     divide(21, 6);
		
		
		
	}
	
	
	public static void divide(int a , int b) {
		
	try {
		System.out.println("Above line");
		System.out.println(a/b); //exception occuring in a particular line
		System.out.println("Below line");
	}
	catch(Exception e) {
		System.err.println(e.getMessage());
	}
	}
	
}

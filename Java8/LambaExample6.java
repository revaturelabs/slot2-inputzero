package interfacesJava8;

@FunctionalInterface
interface Addition{
	int add (int a, int b); 
	//whenever they call the method they have to pass 2 integer value
	// als0 it returns an integer
}

// add is an abstract method here it takes 2 arguments and returns integer
public class LambaExample6 {

	public static void main(String[] args) {
		
		Addition sum = (a, b) -> a+b;
		
		int returnedValue = sum.add(5, 6);
		
		System.out.println(returnedValue);
				
		System.out.println(sum.add(5, 6));
		
		System.out.println(sum.add(10,  23));
		
		System.out.println(sum.add(11, 34));
	}
}

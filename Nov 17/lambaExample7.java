package interfacesJava8;

@FunctionalInterface
interface Calculator{
	int calculate (int a ,int b);
}

public class lambaExample7 {
	public static void main(String[] args) {
		
		//Sum -> a, b return a+b
		
		Calculator  sum = (a, b) -> a+b;
		
		System.out.println(sum.calculate(10, 10));
		System.out.println(sum.calculate(23, 44));
		System.out.println(sum.calculate(11, 10));
		
		//diff -> a,b return a-b
		
		
		// prod -> a,b return a*b
		
		
		//rem -> a,b return a%b
		
		
		//quo -> a, b return a/b
		
		
		
	}

}

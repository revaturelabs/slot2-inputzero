package exceptions;

public class Example1 {
/**UnChecked Exception or Runtime Exceptions**/
//1. After running this program only we got exception
//2. all these complining without any error
//3. not mandatory to have try and catch
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		//System.out.println(a/b); 
		//divide a number by zero -> Arithemetic exception
		
		
		int arr[] = new int[5];
		
		System.out.println(arr[3]);
		
		//System.out.println(arr[5]);
		//trying to access the index >=length ->ArrayIndexoutOfbound
			
		
		String s = null;
			
		//System.out.println(s.toLowerCase());
		// s doesn't have any values, its just null, 
		//but to change the null to lowercase -> Null pointer exceptions
	}

}

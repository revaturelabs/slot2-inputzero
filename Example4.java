package exceptions;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) throws UserNotFoundException{ // throws keyword always with a method, 
		//telling this method may throw an exception -> custom exception -> checked exception
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String username = sc.next();
		
		
		try {	
			
		if (isUserFound(username )) {
			
			System.out.println("Welcome back!!");
			
		}else {
			UserNotFoundException e = new UserNotFoundException();
			throw  e;// throw keyword is used to throw the exception object
		}
		
		}catch(Exception e) {
		System.err.println(e.getMessage());
		}finally {
			System.err.println("HIIIII");
		}
		
		

	}
	
	public static boolean isUserFound (String s) {
		String[] users = {"Porkodi", "Tamil", "Vijay", "Sahasita", "Ganesh"};
		for (int i = 0; i < users.length; i++) {
			if (s.equals(users[i])) {
				return true;
			}
					}
		return false;
	}

}

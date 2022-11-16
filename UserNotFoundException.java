package exceptions;
//extends Exception
//or
//extends Throwable

/*
 * Throwable
 * |
 * Exception
 * |
 * UserNotFoundException
 */

public class UserNotFoundException extends Exception{

	//constructor
	public UserNotFoundException() {
		super("User is not there in our database");
	}

}

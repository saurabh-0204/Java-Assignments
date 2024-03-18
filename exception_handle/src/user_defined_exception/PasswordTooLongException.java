package user_defined_exception;

public class PasswordTooLongException extends Exception {
	private String msg;

	public PasswordTooLongException() {
		msg = "User Entering more than 12 characters in Password  ";
	}

	public String getMessage() {
		return msg;
	}

	public String toString() {
		return "PasswordTooLongException :" + msg;

	}
}

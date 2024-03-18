package user_defined_exception;

public class PasswordTooShort extends Exception {
	private String msg;

	public PasswordTooShort() {
		msg = "User Entering less than 8 characters in Password  ";
	}

	public String getMessage() {
		return msg;
	}

	public String toString() {
		return "PasswordTooLongException :" + msg;

	}

}

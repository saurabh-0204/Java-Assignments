package user_defined_exception;

import java.util.Scanner;

public class UserPasswordMain {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter Password");
		String string = scanner.next();
            
		try {
			if (string.length()<8) {
				throw new PasswordTooShort();

			}
			if (string.length()>12) {
				throw new PasswordTooLongException();
			}
	}
			catch (Exception e) {
			 System.out.println("Enter Valid Pass betweeen 8 to 12 characters only");
		}
		finally {
			System.out.println("Home Page");
		}

	}

}

package string_basics;

public class Program6 {
	public static void main(String[] args) {
		String string = "We%come";
		int capital = 0;
		int Numeric = 0;
		int special = 0;
		for (int i = 0; i < string.length(); i++) {
			char value = string.charAt(i);
			if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
				capital++;
			} else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {

			} else if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
				Numeric++;
			} else if ((string.charAt(i) >= 123 && string.charAt(i) >= 127)
					|| (string.charAt(i) >= 91 && string.charAt(i) <= 96)
					|| (string.charAt(i) >= 0 && string.charAt(i) <= 47)
					|| (string.charAt(i) >= 58 && string.charAt(i) <= 64)) {
				special++;
			} else {
				System.out.println("Special character is missing");
			}
		}
		if (capital >= 1) {
			System.out.println("Captial character AVailable");
		} else {
			System.out.println("Captial character missing");

		}
		if (special >= 1) {
			System.out.println("Special character AVailable");
		} else {
			System.out.println("special character missing");

		}
		if (Numeric >= 1) {
			System.out.println("numeric character AVailable");
		} else {
			System.out.println("numeric character missing");

		}
	}
}

package string_basics;

public class Program1 {
	public static void main(String[] args) {

		String string = "HeL&lO";

//		for (int i = 0; i < string.length(); i++) {
//			int value = string.charAt(i);
//			System.out.println("ASCII Value of  " + string.charAt(i) + " is : " + value);
//
//		}
		for (int i = 0; i < string.length(); i++) {
			char value = string.charAt(i);
			if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
				System.out.println("change  " + string.charAt(i) + "  " + (char) (value + 32));
			} else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
				System.out.println("change   " + string.charAt(i) + "  " + (char) (value - 32));

			} else {
				System.out.println(string.charAt(i));
			}
		}
//		int consonents = 0;
//		int vowels = 0;
//		System.out.println("Number of consonents and Vowels");
//		for (int i = 0; i < string.length(); i++) {
//			char value = string.charAt(i);
//			if (value == 'a' || value == 'A') {
//				vowels++;
//			} else if (value == 'e' || value == 'E') {
//				vowels++;
//
//			} else if (value == 'i' || value == 'I') {
//				vowels++;
//			} else if (value == 'o' || value == 'O') {
//				vowels++;
//			} else if (value == 'u' || value == 'U') {
//				vowels++;
//
//			} else {
//				consonents++;
//			}
//		}
//		System.out.println("Consonnets " + consonents);
//		System.out.println("Vowels " + vowels);
	}
}

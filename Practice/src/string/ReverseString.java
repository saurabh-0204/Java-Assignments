package string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter String");
		String s = scanner.next();

		System.out.print(revrse(s));
	}

	private static String revrse(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char[] strs = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(strs[i]);
		}
		return sb.toString();
	}
}

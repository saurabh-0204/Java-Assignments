package random;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		System.out.println("Enter number for factorial");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Factorial of " + num + " is " + fact(num));
	}

	private static int fact(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return num*fact(num-1);
	}
}
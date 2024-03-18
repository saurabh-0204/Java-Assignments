package random;

import java.util.Scanner;

public class Fibbonaci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scanner.nextInt();
		printFibbonacy(num);

	}

	private static void printFibbonacy(int num) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= num; i++) {
			if(i!=num)
				System.out.print(a + ",");
			else {
				System.out.println(a+".");
			}
			a = b;
			b = c;
			c = a + b;
		}
	}
}

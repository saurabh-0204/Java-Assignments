package random;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check prime : ");
		int num = scanner.nextInt();
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				cnt++;
		}
		System.out.println(cnt);
		if (cnt == 2)
			System.out.println("Number is Prime ");
		else {
			System.out.println("Number is not prime");
		}
	}
}

package mainController;

import java.util.Iterator;
import java.util.Scanner;

import utility.MyNumber;

public class Operations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = scanner.nextInt();
		MyNumber myNumber = new MyNumber(a);
		System.out.println("Factor of That number    :" + myNumber.callFactorial(a));
		System.out.println("The number is Even     :" + myNumber.isEven(a));
		System.out.println("The number is Odd     :" + myNumber.isOdd(a));
		System.out.println("The number is Prime     :" + myNumber.isPrime(a));

	}
}

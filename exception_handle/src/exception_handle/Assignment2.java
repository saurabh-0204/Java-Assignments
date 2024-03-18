package exception_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of array");
		try {
			int size = scanner.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter Element in Array At index :" + i);

				arr[i] = scanner.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (InputMismatchException e) {
			// System.out.println(e.getMessage());
			System.out.println("InPut Mismatch Exception");
		} catch (Exception e) {
			System.out.println("Exception Occuered And Handled");
		}

	}
}

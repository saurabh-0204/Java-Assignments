package mainController;

import java.util.Scanner;

import utility.Customer;
import utility.RegCustomer;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Scanner scanner = new Scanner(System.in);
		RegCustomer c2 = new RegCustomer();
		System.out.println("Eneter Amount");
		double amount = scanner.nextDouble();
		System.out.println("Eneter your Choice");
		System.out.println("\n1. Customer \n2.Regular Customer");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println(c1.giveDiscount(amount));
			break;
		}
		case 2:
			System.out.println(c2.giveDiscount(amount));
			break;
		default:
			System.out.println("Enter Valid Choice");
			break;
		}
	}
}

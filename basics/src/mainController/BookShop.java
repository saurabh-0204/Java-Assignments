package mainController;

import java.util.Iterator;
import java.util.Scanner;

import utility.Book;
import utility.E_Book;
import utility.PaperBook;

public class BookShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice 1. Ebook      2.Offline Book ");
		int choice = scanner.nextInt();

		Book[] allBooks = new E_Book[5];
		allBooks[0] = new E_Book(1, 683, "Chalo Delhi");
		allBooks[1] = new E_Book(2, 445, "History");
		allBooks[2] = new E_Book(3, 528, "Java");
		allBooks[3] = new E_Book(4, 1120, "Python");
		allBooks[4] = new E_Book(5, 899, "C++");
		Book[] papBooks = new PaperBook[5];
		papBooks[0] = new PaperBook(1, 283, "Chalo Delhi");
		papBooks[1] = new PaperBook(2, 445, "History");
		papBooks[2] = new PaperBook(3, 528, "Java");
		papBooks[3] = new PaperBook(4, 1120, "Python");
		papBooks[4] = new PaperBook(5, 899, "C++");
		if (choice == 1) {

			for (int i = 0; i < allBooks.length; i++) {
				System.out.println(allBooks[i].toString());
				System.out.println(allBooks[i].calculateCost());
			}

		} else if (choice == 2) {
			for (int i = 0; i < papBooks.length; i++) {
				System.out.println(papBooks[i].toString());
				System.out.println(papBooks[i].calculateCost());
			}
		}
	}
}

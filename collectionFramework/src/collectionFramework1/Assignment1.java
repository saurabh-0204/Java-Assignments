package collectionFramework1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Element you want add");
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element for Add in Collection");
			list.add(scanner.next());
		}
		System.out.println(list);
		/*
		  System.out.println("Enter Index for Remove Elemnt");
		  list.remove(scanner.nextInt());
		  System.out.println("After Removing Collection is \n"+list);
		  
		  System.out.println("The Number of elements in Collection are : "+
		  list.size()); System.out.println("Using Adavnce for loop"); for (String s :
		  list) { System.out.println(s); }
		  
		  System.out.println("Using iterator"); Iterator<String>
		  iterator=list.iterator(); while (iterator.hasNext())
		 * System.out.println(iterator.next());
		 * 
		 * 
		 * System.out.println("Using List iterator"); ListIterator<String> listIterator
		 * = list.listIterator(); 
		 * while (listIterator.hasNext()) listIterator.next();
		 * while(listIterator.hasPrevious())
		 * System.out.println(listIterator.previous().toLowerCase());
		
		 * System.out.println("Using For Each Method"); list.forEach((String
		 * s)->System.out.println(s));
		 * 
		 System.out.println("\n Sorted List");
		 * System.out.println(list);
		
		System.out.println("Reverse List");
		ListIterator<String> i=list.listIterator();
		while(i.hasNext())
			i.next();
		while(i.hasPrevious())
			System.out.print(" "+ i.previous());
			 */
		 Collections.sort(list);
		System.out.println("Enter Element to find");
		String search=scanner.next();
		
			if (list.contains(search)) {
				System.out.println(list.indexOf(search));
			}
			else {
				System.out.println("Element Not Present");
			}
		
	}

}

package utility;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = { 10, 20, 50, 60, 22, 88, 43, 54 };
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}
		System.out.println("***********");
		System.out.println(Arrays.toString(a));

	}
}

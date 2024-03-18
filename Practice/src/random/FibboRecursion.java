package random;

public class FibboRecursion {
	public static void main(String[] args) {
		System.out.println("Fibbonacy Series");

		for (int i = 0; i <= 11; i++) {
			System.out.print(printFibbonacy(i) + " ");
		}
	}

	private static int printFibbonacy(int i) {
		if (i <= 1) {
			return i;
		}
		return printFibbonacy(i - 1) + printFibbonacy(i - 2);

	}
}

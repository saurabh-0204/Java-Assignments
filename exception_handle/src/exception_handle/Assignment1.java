package exception_handle;
public class Assignment1 {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.println(n1 / n2);

			System.exit(0);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Trying divide the number by zero");
		} catch (Exception e) // any type of exception
		{
			e.printStackTrace();
		} finally {
			System.out.println("in finally block");
		}
	}

}

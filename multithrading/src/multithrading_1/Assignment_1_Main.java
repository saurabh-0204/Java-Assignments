package multithrading_1;

public class Assignment_1_Main {
	public static void main(String[] args) {
		Thread thread = new Assignment1();
		thread.start();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main thread prints : " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			
		}
	}
}

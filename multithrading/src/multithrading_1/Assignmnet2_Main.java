package multithrading_1;

public class Assignmnet2_Main {
	public static void main(String[] args) {
		Runnable runnable = new Assignmnet2();
		Thread thread = new Thread(runnable);
		thread.start();
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println("Main Thread Prints : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}

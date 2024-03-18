package multithrading_1;

public class Assignment_3 implements Runnable {
	private Thread thread;

	public Assignment_3() {
		thread = new Thread(this);
	}

	public Thread getThread() {
		return thread;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread Prints : " + i);
		}
	}

}



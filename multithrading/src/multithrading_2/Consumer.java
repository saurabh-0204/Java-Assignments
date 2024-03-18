package multithrading_2;

public class Consumer implements Runnable {

	private Thread thread;
	private Stock stock;
	private boolean bRun;

	public Consumer(Stock stock) {
		thread = new Thread(this);
		this.stock = stock;
		bRun = true;
	}

	public Thread geThread() {
		return thread;
	}

	public void run() {
		while (bRun) {
			stock.consumer();
		}
	}

	public void stopNow() {
		bRun = false;
	}

}

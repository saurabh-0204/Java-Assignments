package multithrading_2;

public class Producer implements Runnable {

	private Thread thread;
	private Stock stock;
	private boolean bRun;

	public Producer(Stock stock) {
	 thread=new Thread(this);
	 this.stock=stock;
	 bRun=true;
	}
	public Thread geThread() {
		return thread;
	}
	public void run() {
		while (bRun) {
			stock.producer();
		}
	}
	
	public void stopNow() {
		bRun=false;
	}
}

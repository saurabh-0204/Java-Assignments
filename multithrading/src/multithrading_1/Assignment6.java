package multithrading_1;

public class Assignment6 implements Runnable {
	private Thread thread;
	private int start;
	private int end;

	public Assignment6(int start, int end) {
		this.start = start;
		this.end = end;
		thread = new Thread(this);
	}

	public void run() {
		boolean flag=false;
		for (int i = 0; i <5 ; i++) {
			
		}
	}
}

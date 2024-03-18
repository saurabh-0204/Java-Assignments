package multithrading_1;

public class CountDown implements Runnable {
	private Thread thread;
	private String name;
	private int num;

	public CountDown(int num, String name) {
		this.num = num;
		this.name = name;
		thread = new Thread(this);
	}

	public Thread getThread() {
		return thread;
	}

	public void run() {
		while (num > 0) {
			System.out.println(name + " Thredas count down  " + num);
			num--;
		}
	}
}

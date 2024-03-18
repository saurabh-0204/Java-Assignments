package multithrading_2;

import java.io.FileWriter;
import java.io.IOException;

public class DivisorThread implements Runnable {
	private Thread thread;
	private FileWriter fileWriter;
	private int number;

	public Thread getThread() {
		return thread;
	}

	public DivisorThread(FileWriter fileWriter, int number) {
		super();
		this.thread = new Thread(this);
		this.fileWriter = fileWriter;
		this.number = number;
	}

	public void run() {
		synchronized (fileWriter) {
			try {
				fileWriter.write("Divisors of " + number + " are : ");
				for (int i = 1; i < number; i++) {
					if (number % i == 0) {

						fileWriter.write("" + i + " , ");
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

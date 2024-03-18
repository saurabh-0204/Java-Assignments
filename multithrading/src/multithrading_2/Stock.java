package multithrading_2;

public class Stock {
	private int qntyProduced;
	int qntyConsumed;
	boolean bProduced;

	public Stock() {
		qntyProduced = qntyConsumed = 0;
		bProduced = false;
	}

	
	public int getQntyProduced() {
		return qntyProduced;
	}


	public synchronized void producer() {
		if (bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qntyProduced++;
		System.out.println("Produced : " + qntyProduced);
		bProduced = true;
		notify();
	}

	public synchronized void consumer() {
		if (!bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qntyConsumed++;
		System.out.println("Consumed : " + qntyConsumed);
		bProduced = false;
		notify();
	}
}

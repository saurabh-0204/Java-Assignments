package multithrading_1;

public class Assignmnet2 implements Runnable {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("THread print : " + i);

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

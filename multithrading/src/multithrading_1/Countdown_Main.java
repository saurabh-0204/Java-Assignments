package multithrading_1;

public class Countdown_Main {
	public static void main(String[] args) {
		CountDown countDown1 = new CountDown(13, "First");
		CountDown countDown2 = new CountDown(22, "Second");
		CountDown countDown3 = new CountDown(13, "Third");

		countDown1.getThread().start();
		countDown2.getThread().start();
		countDown3.getThread().start();
	}
}

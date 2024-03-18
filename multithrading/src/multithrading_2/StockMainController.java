package multithrading_2;

public class StockMainController {
	public static void main(String[] args) {
		Stock stock = new Stock();
		Producer producer = new Producer(stock);
		Consumer consumer = new Consumer(stock);

		producer.geThread().start();
		consumer.geThread().start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		producer.stopNow();
		consumer.stopNow();

		try {
			producer.geThread().join();

			consumer.geThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Total qty produced : " + stock.getQntyProduced());
		System.out.println("Total qty cosumed : " + stock.qntyConsumed);
	}
}

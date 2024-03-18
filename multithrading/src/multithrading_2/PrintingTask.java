package multithrading_2;

//1
public class PrintingTask implements Runnable {

	// 2
	private Thread t;
	private Printer p;
	private String header, body, footer;

	// 3
	public PrintingTask(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.t = new Thread(this);
	}

	// 4
	public Thread getT() {
		return t;
	}

	// 5
	public void run() {
		p.print(header, body, footer);
	}

}

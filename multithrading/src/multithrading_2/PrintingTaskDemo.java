package multithrading_2;


public class PrintingTaskDemo {

	public static void main(String[] args) {
		Printer p = new Printer();
		
		//newly created
		PrintingTask t1 = new PrintingTask(p, "{", "welcome to java", "}");
		PrintingTask t2 = new PrintingTask(p, "[", "welcome to multithreading", "]");
		PrintingTask t3 = new PrintingTask(p, "(", "thread synchronization", ")");
		
		System.out.println("Printing task begins ....");
		
		t1.getT().start();
		t2.getT().start();
		t3.getT().start();
		
		try
		{
			t1.getT().join();
			t2.getT().join();
			t3.getT().join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Printing task ends ......");
		
		
	}

}


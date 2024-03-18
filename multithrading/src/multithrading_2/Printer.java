package multithrading_2;


public class Printer {

	public synchronized  void print(String header,String body,String footer)
	{
		/*synchronized (this) {
			try
			{
				System.out.print(header);
				Thread.sleep(500);
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				System.out.println();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}*/
		try
		{
			System.out.print(header);
			Thread.sleep(500);
			System.out.print(body);
			Thread.sleep(500);
			System.out.print(footer);
			System.out.println();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

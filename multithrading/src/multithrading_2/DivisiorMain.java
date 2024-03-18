package multithrading_2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class DivisiorMain {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");

		int n = Integer.parseInt(bufferedReader.readLine());

		FileWriter fileWriter = new FileWriter("C:\\Users\\Saurabh\\OneDrive\\Desktop\\CPPLab\\Divisor.dat");

		DivisorThread dv1 = new DivisorThread(fileWriter, n);
		dv1.getThread().start();

		DivisorThread dv2 = new DivisorThread(fileWriter, 511);
		dv2.getThread().start();

		DivisorThread dv3 = new DivisorThread(fileWriter, 393);
		dv3.getThread().start();

		dv1.getThread().join();
		dv2.getThread().join();
		dv3.getThread().join();

		System.out.println("Child thread's task is over");
		fileWriter.close();
	}

}
package stream_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter 'q' for Stop writing ");
		int n;
		try {
			while ((n = bufferedReader.read()) != 'q') {
				System.out.print((char) n);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

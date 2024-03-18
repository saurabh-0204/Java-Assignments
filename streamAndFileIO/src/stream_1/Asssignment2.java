package stream_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Asssignment2 {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter 'stop' for to quite");
		String string;
		try {
			String maxString = "";
			int maxlength = 0;
			while (!((string = bufferedReader.readLine()).equals("stop"))) {
				if (maxlength < string.length()) {
					maxlength = string.length();
					maxString = string;
					System.out.println(string);
				}

			}
			System.out.println("Maximum STring  :  " + maxString);
			System.out.println("length of MaxString is   " + maxlength);
		} catch (IOException e) {
			e.printStackTrace();
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

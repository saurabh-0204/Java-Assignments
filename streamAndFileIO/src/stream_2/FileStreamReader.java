package stream_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Date;

public class FileStreamReader {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("",true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// chances of exception
		// OutputStream os = new FileOutputStream("D:/tests/mydata.txt");

		// File f = new File("D:/tests/mydata.txt");
		// System.out.println("Exists : "+f.exists());
		try {
			File f = new File("C:\\Users\\Saurabh\\OneDrive\\Desktop\\CPPLab");
			System.out.println("Exists : " + f.exists());
			System.out.println("readable : " + f.canRead());
			System.out.println("Size : " + f.length());
			Date d = new Date(f.lastModified());
			System.out.println("Last modified : " + d);
			System.out.println("Directory : " + f.isDirectory());
			System.out.println("File : " + f.isFile());

			if (f.isDirectory()) {
				System.out.println("File is Directory Unable to Open");

			} else {
				System.out.println("Enter stop to quit");
				String str;
				while (!((str = br.readLine()).equals("stop"))) {
					byte[] arr = str.getBytes();
					os.write(arr);
					os.write("\n".getBytes());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closed");
				br.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

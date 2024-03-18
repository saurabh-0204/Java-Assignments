package collectionFramework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Assignmnet4 {
	public static void main(String[] args) throws Exception {
		// read the info from file - opening the stream
		BufferedReader br = new BufferedReader(new FileReader("D:/DAC/java workspace/Email.txt"));
		// create map for storing domain count
		Map<String, Integer> dcount = new HashMap<>();
		String email;
		while ((email = br.readLine()) != null) {
			int atindex = email.indexOf("@");
			// System.out.println(email+" : "+atindex);
			String domain = email.substring(atindex + 1);
			if (dcount.containsKey(domain)) {
				dcount.put(domain, dcount.get(domain) + 1);
			} else {
				dcount.put(domain, 1);
			}
		}
		dcount.forEach((String d, Integer n) -> {
			System.out.println(d + " : " + n);
		});

	}
}

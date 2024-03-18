package collectionFramework3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(10, null);
		map.put(30, "Kunal");
		map.put(null, "Hello");
		map.put(32, "Bye");
		map.put(43, null);
		map.put(43, "Ok");
		System.out.println(map);

		System.out.println();
		System.out.println("*** Using Lamda Expression");
		map.forEach((Integer i,String s)->{
			System.out.println(i+" : "+s);
		});

		System.out.println("Conerting map into Set and using advanced for  ");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> me : set) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		System.out.println("*** Using Iterator ******");
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}

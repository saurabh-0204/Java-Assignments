package collectionFramework3;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignmnet3 {
	public static void main(String[] args) {
		String xyz = "COCCACOLA";
		Map<Character, Integer> map = new TreeMap<>();
		for (short i = 0; i < xyz.length(); i++) {
			char ch = xyz.charAt(i);
			if (map.containsKey(ch)) {
				int n = map.get(ch);
				map.replace(ch, ++n);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println("Using Lamda Expression");
		map.forEach((Character ch, Integer n) -> {
			System.out.println(ch + " : " + n);
		});
		System.out.println();
		System.out.println("Converting Set");
		Set<Entry<Character, Integer>> set = map.entrySet();
		for(Entry<Character,Integer> e: set) {
			System.out.println(e.getKey()+ " : "+e.getValue());
		}
	}
}

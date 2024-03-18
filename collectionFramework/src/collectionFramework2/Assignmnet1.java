package collectionFramework2;

import java.util.HashSet;
import java.util.Set;

public class Assignmnet1 {
	public static void main(String[] args) {
		Set<Student> obj = new HashSet<>();

		obj.add(new Student(6, "shyam", "Pune", 33.32f));
		obj.add(new Student(5, "raju", "dholkarpur", 33.34f));
		obj.add(new Student(3, "chutki", "Pune", 33.32f));
		obj.add(new Student(4, "kaliya", "Pune", 33.32f));

		for (Student s : obj) {
			System.out.println(s);
		}
	}
}

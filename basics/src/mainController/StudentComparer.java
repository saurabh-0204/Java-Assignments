package mainController;

import utility.Comparer;
import utility.MeritComparer;
import utility.Student;

public class StudentComparer {
	public static void main(String[] args) {
		Student[] arr = new Student[2];
		arr[0] = new Student(1, "Lalit", 87.45f);
		arr[1] = new Student(2, "Jay", 99.5f);
		Comparer c = new MeritComparer();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (c.comparer(arr[i], arr[j]) > 0) {
					Student tempStudent = arr[i];
					arr[i] = arr[j];
					arr[j] = tempStudent;
				}
			}
		}
		
	}
}

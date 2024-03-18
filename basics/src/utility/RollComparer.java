package utility;

public class RollComparer implements Comparer {

	public int comparer(Object o1, Object o2) {
		Student s1 = null, s2 = null;
		if (o1 instanceof Student) {
			s1 = (Student) o1;
		}
		if (s2 instanceof Student) {
			s2 = (Student) o2;
		}
		return s1.getS_id() - s2.getS_id();

	}

}

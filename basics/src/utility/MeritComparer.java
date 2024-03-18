package utility;

public class MeritComparer implements Comparer{
	Student s1,s2;

	public int comparer(Object o1, Object o2) {
		if (o1 instanceof Student) {
			 s1=(Student) o1;
		}
		if (o2 instanceof Student) {
			s2=(Student) o2;
		}
		int res =(int) (s1.getPercent()-s2.getPercent());
		return 0;
	}

	@Override
	public String toString() {
		return "MeritComparer [s1=" + s1 + ", s2=" + s2 + "]";
	}

}

package utility;

public class Student {
	private int s_id;
	private String name;
	private float percent;

	public Student(int s_id, String name, float percent) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.percent = percent;
	}

	public int getS_id() {
		return s_id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", percent=" + percent + "]";
	}

}

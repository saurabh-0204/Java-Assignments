package utility;

public class Date {
	private int dd;
	private int mm;
	private int yy;

	public Date() {

	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void display() {
		System.out.println("Birth Date : " + dd + "/" + mm + "/" + yy);
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}
package utility;

public class Doctor extends Person {
	private String degree;
	private int rno;;
	private double salary;

	public Doctor(String name, int dd, int mm, int yy, String degree, int rno, double salary) {
		super(name, dd, mm, yy);
		this.degree = degree;
		this.rno = rno;
		this.salary = salary;
	}

	public Doctor() {
	}

	public void display() {
		super.display();
		System.out.println(" degree : " + degree);
		System.out.println(" Registration Number : " + rno);
		System.out.println(" Salary : " + salary);
	}

	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", rno=" + rno + ", salary=" + salary+super.toString() + "]";
	}

	

}

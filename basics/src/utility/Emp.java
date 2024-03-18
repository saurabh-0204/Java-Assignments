package utility;

public class Emp extends Person {

	private int emp_id;
	protected double salary;

	public Emp() {

	}

	public Emp(String name, int dd, int mm, int yy, int emp_id, float salary) {
		super(name, dd, mm, yy);
		this.emp_id = emp_id;
		this.salary = salary;
	}

	public Emp(String name, Date date, int emp_id, float salary) {
		super(name, date);
		this.emp_id = emp_id;
		this.salary = salary;
	}

	public void display() {
		super.display();
		System.out.println("employee id : " + emp_id);
		System.out.println("employee salary : " + salary);

	}
	public double calSalary(double salary) {
		return this.salary;
		
	}

	@Override
	public String toString() {
		return "Emp [emp_id=" + emp_id + ", salary=" + salary+super.toString() + "]";
	}
	
}

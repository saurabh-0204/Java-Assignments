package utility;

public class SalesManager extends Emp {
	private int target;
	private double incentive;

	public SalesManager(String name, int dd, int mm, int yy, int emp_id, float salary, int target, double incentive) {
		super(name, dd, mm, yy, emp_id, salary);
		this.target = target;
		this.incentive = incentive;
	}

	public double calSalary(double salary) {
		return salary + (target*incentive/100);
	}

	public String toString() {
		return "SalesManager [target=" + target + ", incentive=" + incentive + super.toString() + "]";
	}

}

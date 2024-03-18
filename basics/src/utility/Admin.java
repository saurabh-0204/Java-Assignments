package utility;

public class Admin extends Emp {
	private double bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int emp_id, float salary, double bonus) {
		super(name, dd, mm, yy, emp_id, salary);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nBonus : " + bonus;
	}

	public double calSalary() {
		// basic salary+incentive
		// double gr_sal = super.calSalary()+ bonus;
		double gr_sal = salary + bonus;
		return gr_sal;
	}

}

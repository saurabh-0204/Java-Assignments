package utility;

public class Programmer extends Emp implements ITraveller {
	private int extra_hours;
	private int charges_per_hours;
	private int daysTravelled;

	@Override
	public double calculateTA() {
		return daysTravelled * (salary * DA / 100);
	}

	public Programmer(String name, int dd, int mm, int yy, int emp_id, float salary, int extra_hours,
			int charges_per_hours, int daysTravelled) {
		super(name, dd, mm, yy, emp_id, salary);
		this.extra_hours = extra_hours;
		this.charges_per_hours = charges_per_hours;
		this.daysTravelled = daysTravelled;
	}

	public int getDaysTravelled() {
		return daysTravelled;
	}

	public double calSalary(double salary) {
		double gr_sal = salary + (extra_hours * charges_per_hours) + calculateTA();

		return gr_sal;
	}

	public String toString() {
		return "Programmer [extra_hours=" + extra_hours + ", charges_per_hours=" + charges_per_hours + ", salary="
				+ salary + super.toString() + "]";
	}

}

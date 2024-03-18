package collectionFramework2;

public class Employee implements Comparable<Employee> {

	private int empid;
	private String name;
	private long salary;
	private String dept;

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String name, int empid, long salary, String dept) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Employee e) {
		int diff = 0;
		if (this.salary > e.salary)
			diff = 1;
		else if (this.salary < e.salary)
			diff = -1;
		else if (this.salary == e.salary) {
			diff = this.name.compareTo(e.name);
			if (diff == 0) {
				diff = this.empid - e.empid;
			}
		}
		return diff;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", empid=" + empid + ", salary=" + salary + ", dept=" + dept + "]";
	}

}

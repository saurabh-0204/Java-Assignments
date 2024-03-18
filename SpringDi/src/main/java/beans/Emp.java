package beans;

import java.util.List;

public class Emp {
	int empid;
	Name name;
	List<String> emails;
	Dept dept;

	public Emp(int empid, Name name, List<String> emails, Dept dept) {
		super();
		System.out.println("In Parameteriesd Constructor of EMP");
		this.empid = empid;
		this.name = name;
		this.emails = emails;
		this.dept = dept;
	}

	public Emp() {
		super();
		System.out.println("In Default Constructor of EMP");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", emails=" + emails + ", dept=" + dept + "]";
	}

}

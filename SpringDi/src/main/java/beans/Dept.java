package beans;

public class Dept {
	int deptno;
	String location, dname;

	public Dept(int deptno, String location, String dname) {
		super();
		this.deptno = deptno;
		this.location = location;
		this.dname = dname;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", location=" + location + ", dname=" + dname + "]";
	}

}

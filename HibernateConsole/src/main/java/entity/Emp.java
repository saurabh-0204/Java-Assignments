package entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "emp100")
public class Emp {
	@Id
	@Column(name = "EMPNO")
	String empno;
	@Column(name = "ENAME")
	String ename;
	@Column(name = "JOB")
	String job;
	@Column(name = "MGR")
	int mgr;
	@Column(name = "HIREDATE")
	Date hiredate;
	@Column(name = "SAL")
	float salary;
	@Column(name = "COMM")
	float comm;
	@Column(name = "DEPTNO")
	int deptno;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String empno, String ename, String job, int mgr, Date hiredate, float salary, float comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}

package beans;

public class Name {
	String fname, mname, lname;

	

	public Name(String fname, String mname, String lname) {
		super();
		System.out.println("In para constructor of Name");
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	public Name() {
		
		super();
		System.out.println("In Default constructor of Name");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
}

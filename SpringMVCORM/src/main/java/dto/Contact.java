package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	@Column
	String uid;
	@Column
	String password;
	@Column
	String fname;
	@Column
	String lname;
	@Column
	String email;
	@Column
	String contactno;

	public Contact(String uid, String password, String fname, String lname, String email, String contactno) {
		super();
		this.uid = uid;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactno = contactno;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", uid=" + uid + ", password=" + password + ", fname=" + fname + ", lname="
				+ lname + ", email=" + email + ", contactno=" + contactno + "]";
	}

}


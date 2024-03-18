package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	@Column
	String pname;
	@Column
	float price;

	@ManyToOne
	@JoinColumn(name = "catid")
	Category cid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, float price, Category cid) {
		super();
		this.pname = pname;
		this.price = price;
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCid() {
		return cid;
	}

	public void setCid(Category cid) {
		this.cid = cid;
	}

	public Product(String pname, float price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	

}

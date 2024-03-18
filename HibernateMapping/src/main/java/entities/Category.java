package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int catid;
	@Column
	String cname;
	@Column
	String cdesc;
	@OneToMany(mappedBy = "cid")
	@Cascade(value = CascadeType.ALL)
	Set<Product> products;

	public Category(String cname, String cdesc, Set<Product> products) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
		for (Product product : products)
			product.setCid(this);
		this.products = products;
	}

	public Category(String cname, String cdesc) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		for (Product product : products)
			product.setCid(this);
		this.products = products;
	}

}
